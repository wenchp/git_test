package com.springboot.test.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication标识这是一个主程序类
 */
@SpringBootApplication
public class HelloWorldTest {

    public static void main(String[] args) {
        //启动
        SpringApplication.run(HelloWorldTest.class,args);
    }
}
