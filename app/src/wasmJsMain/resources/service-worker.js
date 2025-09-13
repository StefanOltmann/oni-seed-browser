/*
 * Service Worker for ONI Seed Browser app
 */

const CACHE_NAME = 'oni-seed-browser-cache-VERSION_PLACEHOLDER';

const ASSETS_TO_CACHE = [
    './',
    './index.html',
    './styles.css',
    './app.js',
    './manifest.json',
    './icon.ico',
    './icon_114.png',
    './icon_256.png'
];

/*
 * Message handler for cache management
 */
self.addEventListener('message', (event) => {
    if (event.data && event.data.type === 'CLEAR_CACHE') {
        console.log('Received cache clear request');

        // Clear all caches
        caches.keys().then((cacheNames) => {
            return Promise.all(
                cacheNames.map((cacheName) => {
                    console.log('Deleting cache:', cacheName);
                    return caches.delete(cacheName);
                })
            );
        }).then(() => {
            console.log('All caches cleared');
        });
    }
});

/*
 * Install event - cache all static assets
 */
self.addEventListener('install', (event) => {
    event.waitUntil(
        caches.open(CACHE_NAME)
            .then((cache) => {
                console.log('Opened cache');
                return cache.addAll(ASSETS_TO_CACHE);
            })
            .then(() => self.skipWaiting())
    );
});

/*
 * Activate event - clean up old caches
 */
self.addEventListener('activate', (event) => {
    event.waitUntil(
        caches.keys().then((cacheNames) => {
            return Promise.all(
                cacheNames.map((cacheName) => {
                    if (cacheName !== CACHE_NAME) {
                        console.log('Deleting old cache:', cacheName);
                        return caches.delete(cacheName);
                    }
                })
            );
        })
            .then(() => {
                // Optional: Take control of uncontrolled clients
                // This is commented out to prevent potential refresh loops in production
                // return self.clients.claim();

                // Instead, log that activation is complete
                console.log('Service worker activated and ready');
                return Promise.resolve();
            })
    );
});

/*
 * Fetch event - serve from cache, fallback to network
 */
self.addEventListener('fetch', (event) => {

    /*
     * Skip caching for navigation requests to prevent refresh loops
     */
    if (event.request.mode === 'navigate') {
        event.respondWith(
            fetch(event.request).catch(() => {
                return caches.match(event.request);
            })
        );
        return;
    }

    /*
     * Special handling for WASM files - use network-first strategy
     * to ensure we always get the latest version when available
     */
    if (event.request.url.endsWith('.wasm')) {
        event.respondWith(
            fetch(event.request.clone())
                .then((response) => {
                    if (response && response.status === 200) {
                        // Cache the new WASM file
                        const responseToCache = response.clone();
                        caches.open(CACHE_NAME)
                            .then((cache) => {
                                cache.put(event.request, responseToCache);
                            });
                        return response;
                    }
                    // If network fails, try cache
                    return caches.match(event.request);
                })
                .catch(() => {
                    // Network failed, try cache
                    console.log('Network failed for WASM file, trying cache:', event.request.url);
                    return caches.match(event.request);
                })
        );
        return;
    }

    /*
     * For non-navigation, non-WASM requests, use cache-first strategy
     */
    event.respondWith(
        caches.match(event.request)
            .then((response) => {

                /*
                 * Cache hit - return the response from the cached version
                 */
                if (response) {
                    return response;
                }

                /*
                 * Not in cache - fetch from network
                 */
                return fetch(event.request.clone())
                    .then((response) => {

                        /*
                         * Check if we received a valid response
                         */
                        if (!response || response.status !== 200 || response.type !== 'basic') {
                            return response;
                        }

                        /*
                         * Clone the response as it's a stream and can only be consumed once
                         */
                        const responseToCache = response.clone();

                        /*
                         * Add the new resource to the cache
                         */
                        caches.open(CACHE_NAME)
                            .then((cache) => {
                                cache.put(event.request, responseToCache);
                            });

                        return response;
                    });
            }).catch(() => {

            /*
             * If both cache and network fail, show a generic fallback
             */
            console.log('Fetch failed, network and cache unavailable');

            /*
             * Note: You could return a custom offline page here
             */
        })
    );
});
