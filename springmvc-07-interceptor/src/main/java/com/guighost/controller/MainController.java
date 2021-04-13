package com.guighost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author GuiGhost
 * @date 2021/03/10
 * @className MainController()
 * 描述：
 */
@Controller
@RequestMapping("/user")
public class MainController {
    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){
        //登录成功后将用户登录信息保存到session中
        session.setAttribute("userLoginInfo",username);
        model.addAttribute("username",username);
        return "main";
    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        //登录成功后将用户登录信息保存到session中
        session.removeAttribute("userLoginInfo");
        return "login";
    }

}
