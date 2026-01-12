FROM nginx:1.29.4-alpine

# Copy an NGINX configuration that disables access logging and minimizes error logging.
# To comply with GDPR, no request or connection data is stored by the container.
# Abuse prevention and infrastructure level logging are handled by the hosting provider.
COPY nginx.silent.conf /etc/nginx/nginx.conf

COPY app/build/dist/wasmJs/oni-seed-browser/ /usr/share/nginx/html/
