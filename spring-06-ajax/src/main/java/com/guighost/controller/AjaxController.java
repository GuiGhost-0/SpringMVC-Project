package com.guighost.controller;

import com.guighost.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author GuiGhost
 * @date 2021/03/06
 * @className AjaxController()
 * 描述：
 */
@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>" + name);
        if ("guigui".equals(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }


    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> users = new ArrayList<>();
        //添加数据
        users.add(new User("guigui1",2,"male"));
        users.add(new User("guigui2",2,"female"));
        users.add(new User("guigui3",2,"male"));

        return users;
    }

    @RequestMapping("/a3")
    public String a3(String username,String pwd){
        String msg = "";
        if (username!=null){
            //admin 这些数据应该在数据库中查看
            if("admin".equals(username)){
                msg = "ok";
            }else {
                msg = "用户名有误";
            }
        }
        if (pwd!=null){
            //pwd 这些数据应该在数据库中查看
            if("123456".equals(pwd)){
                msg = "ok";
            }else {
                msg = "密码有误";
            }
        }
        return msg;
    }
}
