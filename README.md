# zoo

````
server-config:
    port : 8001
    stand-alone模式：
        java -jar zoo-server-config-1.0-SNAPSHOT.jar
    
server-eureka:
    port : 
        8101    default
        8102
        8103
    
    默认stand-alone模式
        java -jar zoo-server-eureka-1.0-SNAPSHOT.jar
    可集群启动:
        java -jar zoo-server-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=eureka8101
        java -jar zoo-server-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=eureka8102
        java -jar zoo-server-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=eureka8103    
````