package com.hzit.student.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 判断是否登录
 */
@WebFilter("*.do")
public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest request1 = (HttpServletRequest)request;
        HttpServletResponse response1 = (HttpServletResponse)response;

        String path =  request1.getServletPath();

        System.out.println("path = " + path);

        //获取session
        HttpSession session = request1.getSession();

        String isLogin =  (String)session.getAttribute("isLogin");

        System.out.println("isLogin = " + isLogin);

        //不用拦截的请求
        if(path.equals("/login.do")){
            chain.doFilter(request1,response1);
            return;
        }

        if(isLogin == null ){
            //没有登录
            request.getRequestDispatcher("login.jsp").forward(request,response);
            return;
        }

        //放行
        chain.doFilter(request1,response1);



    }

    @Override
    public void destroy() {

    }
}
