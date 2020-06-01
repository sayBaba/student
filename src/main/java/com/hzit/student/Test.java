package com.hzit.student;

import com.alibaba.fastjson.JSONObject;

public class Test {

    public static void main(String[] args) {
        //创建返回的json格式
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("code","-1");
        jsonObject.put("msg","用户名不正确");

        JSONObject data = new JSONObject();

        data.put("userName","123");

        jsonObject.put("data",data);


        System.out.println(jsonObject);
    }
}
