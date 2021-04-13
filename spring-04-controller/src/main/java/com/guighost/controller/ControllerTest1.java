package com.guighost.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author GuiGhost
 * @date 2021/02/27
 * @className ControllerTest1()
 * 描述：
 */
//只要实现了Controller接口的类，说明这就是一个控制器类，并重写handleRequest方法
public class ControllerTest1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","ControllerTest1");
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
