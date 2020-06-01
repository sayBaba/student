package com.hzit.student.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 过滤器，设置所有的请求的编码格式为UTF-8
 */

@WebFilter("*.do")
public class ChaertFilter implements Filter {


    /**
     * 初始化
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("初始化");

    }

    /**
     * 过滤的逻辑
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //设置编码格式

        HttpServletRequest request1 = (HttpServletRequest)request;
        HttpServletResponse response1 = (HttpServletResponse)response;

        request1.setCharacterEncoding("utf-8");
        response1.setContentType("text/html charset=utf-8");
        response1.setCharacterEncoding("utf-8");

        System.out.println("执行过滤器............");

        //请求放行
        chain.doFilter(request1,response1);




    }

    /**
     * 销毁
     */
    @Override
    public void destroy() {

        System.out.println("销毁");


    }
}
