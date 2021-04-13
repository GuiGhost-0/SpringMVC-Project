package com.guighost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author GuiGhost
 * @date 2021/02/28
 * @className EncodingController()
 * 描述：
 */
@Controller
public class EncodingController {

    /**
     * 通过过滤器解决中文乱码问题
     * 只可以解决Get请求的中文乱码问题，Post请求还是无法解决
     * */
    @RequestMapping("/e/t1")
    public String test(String name, Model model, HttpServletRequest request){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }
}
