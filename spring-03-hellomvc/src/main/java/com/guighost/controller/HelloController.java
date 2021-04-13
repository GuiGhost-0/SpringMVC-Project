package com.guighost.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author GuiGhost
 * @date 2021/02/26
 * @className HelloController()
 * 描述：
 */
//注意：我们这里先导入Controller接口
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //ModelAndView 视图和模型
        ModelAndView mv = new ModelAndView();

        //调用业务层

        //封装对象，放在ModelAndView中。model
        mv.addObject("msg","HelloSpringMVC!");
        //封装要跳转的视图，放在ModelAndView中
        mv.setViewName("hello");//：/WEB-INF/jsp/hello.jsp
        return mv;
    }
}
