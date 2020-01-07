package com.gyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication 使用注解来标注一个主程序类，说明这是一个Spring Boot应用
@SpringBootApplication
public class HelloMainApplication {

    public static void main(String[] args) {

        // Spring应用启动起来
//        run 必须传入 SpringBootApplication 注解的一个类
//        @SpringBootApplication：Spring Boot应用标注在某个类上说明这个类是SpringBoot的主配置类，SpringBoot就应该运行这个累的main方法
//        来启动SpringBoot应用
//        AuthConfigurationPackages.Registrar.class 将主配置类（@SpringBootApplication标注的类）的所在包及下面所有子包里面的所有组件
//        扫描到Spring容器；
        SpringApplication.run(HelloMainApplication.class,args);
    }

}
