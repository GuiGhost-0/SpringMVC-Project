package com.guighost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author GuiGhost
 * @date 2021/02/26
 * @className HelloController()
 * 描述：
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    /**
     * 类上加了@RequestMapping("/XXX")之后,真实访问路径为：
     * localhost:项目名/XXX/hello1
     * 原因：
     * 在类和方法上面都加了@RequestMapping注解时：两者之间会形成一种父子关系
     * 也就是说，在访问时，应先写类上@RequestMapping注解中的路径，然后写方法上面的@RequestMapping注解中的路径
     * 如本例：
     *  http://localhost:8080/spring_03_annotation/hello（类上）/hello1（方法上）
     *
     *  注意：
     *      方法的返回值会被视图解析器处理，也就是会把该返回值当成一个名字拼接成一个完整的路径
     * */
    @RequestMapping("/hello1")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","HelloSpringMVC,I'm Annotation one");
        return "hello";//会被视图解析器处理
    }

    @RequestMapping("/hello2")
    public String hello2(Model model){
        //封装数据
        model.addAttribute("msg","HelloSpringMVC,I'm Annotation two");

        return "hello";//会被视图解析器处理
    }

    @RequestMapping("/hello3")
    public String hello3(Model model){
        //封装数据
        model.addAttribute("msg", "HelloSpringMVC,I'm Annotation three");
        return "hello";//会被视图解析器处理
    }
}
