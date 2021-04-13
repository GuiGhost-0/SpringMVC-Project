package com.guighost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GuiGhost
 * @date 2021/02/28
 * @className ResultSpringMVC()
 * 描述：
 */
@Controller
public class ResultSpringMVC {

    @RequestMapping("/r")
    public String test(Model model,String msg){
        //转发
        model.addAttribute("msg",msg);
        return "test";
    }

    @RequestMapping("/t")
    public String test2(Model model){
        //重定向
        return "redirect:r?msg=RedirectResultSpringMVC";
    }
}
