package com.example.demo.controller;

import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class Demo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //    @GetMapping
//    public Response<Map<String, Object>> get(){
//        Response<Map<String, Object>> response = new Response<>();
//        Map<String, Object> user = new HashMap<>();
//        user.put("name", "demo");
//        user.put("age", 25);
//        response.setData(user);
//        return  response;
//    }


    @GetMapping("/delete")
    public void delete() {
        System.out.println("kkkkkkk9999999oooooooooooopppiiiiiiiii的订单噢噢噢噢哦哦哦哦哦哦哦哦哦ggg啪啪啪啪啪啪铺铺铺");
        String springVersion = SpringVersion.getVersion();
        String springBootVersion = SpringBootVersion.getVersion();
        System.out.println("springVersion  "+springVersion);
        System.out.println("springBootVersion "+springBootVersion );
    }

    @GetMapping("/hello")
    public String hello() {
        List temp=new ArrayList();
        System.out.println("Controller.hello");
        return "hello";
    }

    @RequestMapping(value = "/houru",method = RequestMethod.GET)
    public ModelAndView houru() {
        ModelAndView modelAndView = new ModelAndView("/hello");//设置对应JSP的模板文件
        modelAndView.addObject("name", "miyue");
        return modelAndView;
    }
}


