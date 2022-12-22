package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Optional;

@SpringBootApplication
@Slf4j
public class Demo1Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(Demo1Application.class, args);
        Environment environment = app.getBean(Environment.class);
        log.debug("Swagger 访问链接：http://localhost:" + environment.getProperty("server.port") +
                Optional.ofNullable(environment.getProperty("server.servlet.context-path")).orElse("") + "/swagger-ui.html");
    }
}
