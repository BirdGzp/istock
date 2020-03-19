package com.moon.manager;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动类
 *
 * @author kings.chan
 */
@SpringBootApplication
public class Application {



    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        app.run(args);

    }
}