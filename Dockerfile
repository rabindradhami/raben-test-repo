FROM nginx:1.23.1-alpine
COPY . /usr/share/nginx/html
EXPOSE 8080
WORKDIR /usr/src/test
#ENTRYPOINT ["index.html"]
CMD echo "Test is successful"