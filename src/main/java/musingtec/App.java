package musingtec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *
 * @author angel
 * @date 2018/9/18
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
