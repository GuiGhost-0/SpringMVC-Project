package com.guighost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author GuiGhost
 * @date 2021/02/27
 * @className ControllerTest3()
 * 描述：
 */
@Controller
@RequestMapping("/c3")
public class ControllerTest3 {
    @RequestMapping("/t0")
    public String test(Model model, HttpServletRequest request){
        model.addAttribute("msg","请求路径为：" + request.getRequestURL());
        return "test";
    }
}
