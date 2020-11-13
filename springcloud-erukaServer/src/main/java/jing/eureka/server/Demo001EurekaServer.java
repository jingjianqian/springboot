package jing.eureka.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Demo001EurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(Demo001EurekaServer.class, args);
    }
}
