package com.guighost.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author GuiGhost
 * @date 2021/03/10
 * @className LoginInterceptor()
 * 描述：
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //放行判断：已经登录
        if(request.getSession().getAttribute("userLoginInfo")!=null){
            return true;
        }
        //登录页面也要放行，不然无法登录
        if (request.getRequestURI().contains("login")){
            return true;
        }

        //判断什么情况下没有登录
        request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);
        return false;
    }
}
