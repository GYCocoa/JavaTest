package com.gyz.db.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class JDBCController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    // 查询数据库的所有信息
    @GetMapping("/home/bannerList")
    public Map<String,Object> bannerList(){

        String sql = "select * from banner";
        List<Map<String,Object>> banner_list = jdbcTemplate.queryForList(sql);

        //创建Map对象
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("data",banner_list);
        if (banner_list != null){
            map.put("code",0);
            map.put("state","请求成功");
        }else{
            map.put("code",1);
            map.put("state","请求失败，请稍后重试！");
        }

        return map;
    }

    // 查询数据库的items数据
    @GetMapping("/home/items")
    public Map<String,Object> items(){

        String sql = "select * from items";
        List<Map<String,Object>> banner_list = jdbcTemplate.queryForList(sql);

        //创建Map对象
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("data",banner_list);
        if (banner_list != null){
            map.put("code",0);
            map.put("state","请求成功");
        }else{
            map.put("code",1);
            map.put("state","请求失败，请稍后重试！");
        }

        return map;
    }

    // 查询数据库的广告位数据
    @GetMapping("/home/adItems")
    public Map<String,Object> adItems(){

        String sql = "select * from adItems";
        List<Map<String,Object>> banner_list = jdbcTemplate.queryForList(sql);

        //创建Map对象
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("data",banner_list);
        if (banner_list != null){
            map.put("code",0);
            map.put("state","请求成功");
        }else{
            map.put("code",1);
            map.put("state","请求失败，请稍后重试！");
        }

        return map;
    }

    // 查询数据库的广告位数据
    @GetMapping("/home/adColItems")
    public Map<String,Object> adColItems(){

        String sql = "select * from adColItems";
        List<Map<String,Object>> banner_list = jdbcTemplate.queryForList(sql);

        //创建Map对象
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("data",banner_list);
        if (banner_list != null){
            map.put("code",0);
            map.put("state","请求成功");
        }else{
            map.put("code",1);
            map.put("state","请求失败，请稍后重试！");
        }

        return map;
    }

    // 查询数据库的商品列表数据
    @GetMapping("/home/homeList")
    public Map<String,Object> homeList(){

        String sql = "select * from homeList";
        List<Map<String,Object>> banner_list = jdbcTemplate.queryForList(sql);

        //创建Map对象
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("data",banner_list);
        if (banner_list != null){
            map.put("code",0);
            map.put("state","请求成功");
        }else{
            map.put("code",1);
            map.put("state","请求失败，请稍后重试！");
        }

        return map;
    }

    // SpringBoot框架使用 第一种get传参使用
    @GetMapping("/home/addUser/{id}/{add}")
    public String addUser(@PathVariable("id") String id,@PathVariable("add") String add){
        return "增加用户id = " + id;
    }

    // SpringBoot框架使用 第二种get传参使用
    @GetMapping("/home/deleteUser")
    public String deleteUser(@RequestParam @ApiParam("用户id") String id, @RequestParam String add){
        return "删除用户id = " + id + "add = " + add;
    }

    // post 请求体获取参数
    @PostMapping("/home/post")
    public String post(@RequestBody JSONObject jsonObject){

        System.out.println(jsonObject);

        return "删除用户id = ";
    }

    @ApiOperation("post 请求接口")
    @PostMapping("/home/postList")
    public String postList(@RequestParam(value = "name") @ApiParam("用户名") String name){

        return "name = " + name;
    }

}
