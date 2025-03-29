# distributed-tracing
1. run zipkin 
docker run -d -p 9411:9411 openzipkin/zipkin
2. verify
netstat -an | find "9411"
3. http://127.0.0.1:9411/
search by trace id
4. postman
parent, child, grandchild