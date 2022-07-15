# framework-sample

## nacos
踩坑记录
- mac m1 要下载 nacos-server:v2.1.0-slim
- 要开放9848端口，不然dubbo注册不上去
````
docker pull nacos/nacos-server:v2.1.0-slim
docker run --name nacos -e MODE=standalone -p 8848:8848 -p 9848:9848 -d nacos/nacos-server:v2.1.0-slim
````