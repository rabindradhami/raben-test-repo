FROM nginx:1.23.1-alpinR
COPY . /usr/src/test
EXPOSE 8080
WORKDIR /usr/src/test
ENTRYPOINT ["index.html"]
CMD echo "Test is successful"