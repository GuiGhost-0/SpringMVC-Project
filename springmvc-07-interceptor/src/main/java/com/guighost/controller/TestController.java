package com.guighost.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GuiGhost
 * @date 2021/03/10
 * @className TestController()
 * 描述：
 */
@RestController
public class TestController {
    @GetMapping("/t1")
    public String test(){
        System.out.println("TestController的test方法执行了");
        return "ok";
    }
    @GetMapping("/t2")
    public String test2(){
        System.out.println("test2/");
        return "test2";
    }
}
