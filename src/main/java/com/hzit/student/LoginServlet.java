package com.hzit.student;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 登录控制器
 */
@WebServlet(name = "login",urlPatterns = {"/login.do"})
public class LoginServlet extends HttpServlet {


    //json
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//
//        resp.setContentType("text/html charset=utf-8");
//        resp.setCharacterEncoding("UTF-8");

        String userName = req.getParameter("ope_name");
        //调用方法

        //创建session
       HttpSession session = req.getSession();


        String password = req.getParameter("ope_pwd");

        JSONObject jsonObject = new JSONObject(); //创建返回的json格式

        if(!"qwe".equals(userName)){
            req.setAttribute("errMsg","用户名不正确");
//            resp.getWriter().println("用户名不正确");

            jsonObject.put("code","-1");
            jsonObject.put("msg","用户名不正确");

//            JSONObject data = new JSONObject(); //创建返回的json格式

//            data.put("userName","123");

            jsonObject.put("data",null);

            resp.getWriter().println(jsonObject);

            return;

        }

        if(!"123".equals(password)){
            req.setAttribute("errMsg","密码不正确");
            resp.getWriter().println("密码不正确");

            jsonObject.put("code","-1");
            jsonObject.put("msg","密码不正确");

//            JSONObject data = new JSONObject(); //创建返回的json格式
//
//            data.put("userName","123");

            jsonObject.put("data",null);

            resp.getWriter().println(jsonObject);

            return;


        }

        jsonObject.put("code","0");
        jsonObject.put("msg","登录成功");

        JSONObject data = new JSONObject(); //创建返回的json格式

        data.put("userName","123");

        jsonObject.put("data",null);

        session.setAttribute("isLogin","true");

        resp.getWriter().println(jsonObject);

//        req.getRequestDispatcher("login.jsp").forward(req,resp);


    }

    public static void main(String[] args) {

        //创建返回的json格式
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("code","-1");
        jsonObject.put("msg","用户名不正确");

        System.out.println(jsonObject);




        System.out.println();
        //json 转 javaven

//
       JSONObject data = new JSONObject(); //创建返回的json格式
//
//        data.put("userName","123");
//
//        jsonObject.put("data",data);



    }
}



