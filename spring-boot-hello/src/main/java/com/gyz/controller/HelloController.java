package com.gyz.controller;

import com.gyz.pojo.Users;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/gyz")
@ResponseBody
public class HelloController {

//    RequestMapping 注解接受请求   ResponseBody 发送到web浏览器
    @GetMapping("/home")
    // 请求接口 http://192.168.20.176:8080/gyz/home
    public String home(){
        return "{'name':'name'}";
    }

    @GetMapping("/thymeleaf")
//    thymeleaf 语法
    public String thymeleaf(Model model) {
        model.addAttribute("msg","model 添加数据");
        return "thymeleaf-test";
    }

//    只要我们的接口中，返回值中存在实体类，他就会被扫描到Swagger中
    @PostMapping("/user")
    public Users users(){
        return new Users();
    }

    @ApiOperation("欢迎接口")
    @GetMapping("/welcome")
    public String welcome(@ApiParam("用户名") String name){
        return "welcome " + name;
    }

}
