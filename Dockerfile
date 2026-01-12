FROM nginx:1.27-alpine

COPY app/build/dist/wasmJs/oni-seed-browser/ /usr/share/nginx/html/
