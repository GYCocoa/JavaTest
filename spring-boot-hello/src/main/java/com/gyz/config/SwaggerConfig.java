package com.gyz.config;

import com.sun.tools.javac.sym.Profiles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.print.Doc;
import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // 配置swagger的Docket的bean实例

    @Bean
    public Docket docketTwo(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("KEVIN");
    }

    @Bean
    public Docket docket(Environment environment){

        // 获取项目的环境 是dev环境才能访问
        boolean bool = environment.acceptsProfiles("dev");

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .groupName("GY.Z")
                .enable(bool)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.gyz.controller"))
                .build();
    }

    // 配置swagger信息
    private ApiInfo apiInfo(){
        // 作者信息
        Contact contact = new Contact("GY.Z", "https://www.baidu.com", "401812221@qq.com");
        return new ApiInfo(
                "GY.Z Swagger",
                "Api 文档",
                "v1.0",
                "https://www.baidu.com",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }




}
