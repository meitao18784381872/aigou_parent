package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication//标记为springboot的一个应用
@EnableEurekaServer //表示该类为 服务注册中心
public class EurekaServerApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication_7001.class);
    }
}