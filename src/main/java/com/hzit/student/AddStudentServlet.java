package com.hzit.student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/addStudent.do")
public class AddStudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("........addStudent.........");

        //获取session
//        HttpSession session = request.getSession();
//
//        String isLogin =  (String)session.getAttribute("isLogin");
//
//        if(isLogin == null || !isLogin.equals("true")){
//            //没有登录
//            request.getRequestDispatcher("login.jsp").forward(request,response);
//            return;
//        }


        request.getRequestDispatcher("addStudent.jsp").forward(request,response);


    }
}
