## clone代码 

git clone git@gitlab.corp.qunar.com:junming.wang/spring4-stepbystep.git

cd spring4-stepbystep/samples/hessian

## 执行安装install操作
mvn clean install

##  执行启动provider 服务端应用
mvn clean spring-boot:run -f provider/pom.xml

##  执行consumer测试(打开一个新的sell) 消费端应用
mvn clean test -f consumer/pom.xml
