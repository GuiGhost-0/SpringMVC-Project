package com.guighost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GuiGhost
 * @date 2021/02/27
 * @className ControllerTest2()
 * 描述：
 */
@Controller
/**
 * @Controller 该注解代表这个类会被Spring接管
 * 这个类中的所有方法，如果返回值为String类型，
 * 并且有与之对应的页面可以跳转，那么就会被视图解析器解析
 * */
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";
    }

    @RequestMapping("/t3")
    public String test3(Model model){
        model.addAttribute("msg","ControllerTest3");
        return "test";
    }
}
