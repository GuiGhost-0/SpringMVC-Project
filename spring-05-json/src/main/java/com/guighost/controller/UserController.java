package com.guighost.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.guighost.pojo.User;
import com.guighost.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;

/**
 * @author GuiGhost
 * @date 2021/03/04
 * @className UserController()
 * 描述：用户控制器类
 */
//@Controller
@RestController
/**
 * 该注解在@Controller注解的基础上，限制了该类中的方法返回的都是字符串
 * */
public class UserController {

    @RequestMapping("/j1")
//    @ResponseBody //它就不会走视图解析器，会直接返回一个字符串
    /**
     * @ResponseBody 注解是与@Controller注解配合使用
     * 作用：它就不会走视图解析器，会直接返回一个字符串
     * 用了@RestController注解后@ResponseBody就可以省略不用
     * */
    public String json1(){
        //创建一个对象
        User user = new User("鬼鬼",3,"男");

        return JsonUtils.getJson(user);
    }

    @RequestMapping(value = "/j2",produces = "application/json;charset=UTF-8")
    public String json2(){
        User user1 = new User("鬼鬼1",3,"男");
        User user2 = new User("鬼鬼2",3,"男");
        User user3 = new User("鬼鬼3",3,"男");
        User user4 = new User("鬼鬼4",3,"男");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        return JsonUtils.getJson(users);
    }

    @RequestMapping(value = "/j3",produces = "application/json;charset=UTF-8")
    public String json3(){

        Date date = new Date();
        //ObjectMapper中，时间解析后的默认格式为：Timestamp，时间戳
        return JsonUtils.getJson(date);
    }

    @RequestMapping(value = "/j4",produces = "application/json;charset=UTF-8")
    public String json4(){

        User user1 = new User("鬼鬼1",3,"男");
        User user2 = new User("鬼鬼2",3,"男");
        User user3 = new User("鬼鬼3",3,"男");
        User user4 = new User("鬼鬼4",3,"男");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


        System.out.println("*******Java对象 转 JSON字符串*******");
        String str1 = JSON.toJSONString(users);
        System.out.println("JSON.toJSONString(list)==>"+str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>"+str2);

        System.out.println("\n****** JSON字符串 转 Java对象*******");
        User jp_user1=JSON.parseObject(str2,User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+jp_user1);

        System.out.println("\n****** Java对象 转 JSON对象 ******");
        JSONObject jsonObject1 = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>"+jsonObject1.getString("name"));

        System.out.println("\n****** JSON对象 转 Java对象 ******");
        User to_java_user = JSON.toJavaObject(jsonObject1, User.class);
        System.out.println("JSON.toJavaObject(jsonObject1, User.class)==>"+to_java_user);

        return JSON.toJSONString(users);
    }
}
