package com.guighost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author GuiGhost
 * @date 2021/02/28
 * @className RestFulController()
 * 描述：
 */
@Controller
public class RestFulController {

    //传统方式：http://localhost:8080/spring_04_controller/add?a=9&b=9
    //RestFul：http://localhost:8080/spring_04_controller/add/a/b

//    @RequestMapping("/add/{a}/{b}")
    public String test(@PathVariable int a, @PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","结果为" + res);
        return "test";
    }

    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","test2的结果为" + res);
        return "test";
    }


}
