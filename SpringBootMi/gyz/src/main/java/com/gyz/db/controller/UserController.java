package com.gyz.db.controller;

import com.gyz.db.mapper.UserMapper;
import com.gyz.db.pojo.User;
import com.gyz.db.utils.MsgResponse;
import com.gyz.db.utils.RandomTools;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @ApiOperation("用户注册")
    @PostMapping("/user/addUser")
    public MsgResponse addUser(@RequestParam("nickname") @ApiParam("用户名") String nickname,
                               @RequestParam("password") @ApiParam("密码") String password,
                               @RequestParam(value = "icon",required = false)@ApiParam("用户头像，非必传")String icon)
    {
        HashMap<String, Object> map = new HashMap<String,Object>();
        if (nickname == null || password == null){
            return MsgResponse.paramsError("参数错误");
        }

        String token = RandomTools.getRandomString();
        User user = new User(0,nickname,password,null,null,token);
        userMapper.addUser(user);
        map.put("nickname",nickname);
        map.put("token",token);
        return MsgResponse.success("请求成功",map);
    }

    @ApiOperation("用户登录")
    @PostMapping("/user/login")
    public MsgResponse login(@RequestParam("nickname") @ApiParam("用户名") String nickname,
                               @RequestParam("password") @ApiParam("密码") String password)
    {
        HashMap<String, Object> map = new HashMap<String,Object>();
        if (nickname == null || password == null){
            return MsgResponse.paramsError("参数错误");
        }
        map = (HashMap<String, Object>) userMapper.queryUserByNickname(nickname);
        if (map == null){
            return MsgResponse.error("请求出错！");
        }
        return MsgResponse.success("请求成功",map);
    }

    @ApiOperation("查询所有用户")
    @GetMapping("/user/userList")
    public MsgResponse queryUserList(){
        List<User> list;
        try {
            list = userMapper.queryUserList();
            return MsgResponse.success("请求成功!", list);
        } catch (Exception e) {
            e.printStackTrace();
            return MsgResponse.error(e.getMessage());
        }
    }

    @ApiOperation("查询用户")
    @GetMapping("/user/queryUser")
    public MsgResponse queryUserById(@RequestParam("id")int id){
        Map user;
        try {
            user = (Map) userMapper.queryUserById(id);
            return MsgResponse.success("请求成功!", user);
        } catch (Exception e) {
            e.printStackTrace();
            return MsgResponse.error(e.getMessage());
        }
    }

    @GetMapping("/user/user")
    public  User user(){
        return new User();
    }

}
