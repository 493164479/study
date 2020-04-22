package com.study.interceptor;

import com.study.pojo.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class MyInterceptorConfig implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user= (User) request.getSession().getAttribute("login");
        if(user==null){
            request.setAttribute("msg","没有访问权限!");
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }else {
            return true;
        }
    }
}
