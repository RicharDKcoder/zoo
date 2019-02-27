# zoo

````
server-eureka:
    port : 
        8001    default
        8002
        8003
    
    默认stand-alone模式:
        java -jar zoo-server-eureka-1.0-SNAPSHOT.jar
    可集群启动:
        java -jar zoo-server-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=eureka8101
        java -jar zoo-server-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=eureka8102
        java -jar zoo-server-eureka-1.0-SNAPSHOT.jar --spring.profiles.active=eureka8103 
        
server-config:
    port : 8101
    stand-alone模式:
        java -jar zoo-server-config-1.0-SNAPSHOT.jar
    
server-zuul:
    port : 8201
    stand-alone模式: 
        java -jar zoo-server-zuul-1.0-SNAPSHOT.jar 
        
server-customer:
    port : 8301
    启动:
        java -jar zoo-server-customer-1.0-SNAPSHOT.jar
  
server-score:
    port : 8401
    启动:
        java -jar zoo-server-score-1.0-SNAPSHOT.jar
````