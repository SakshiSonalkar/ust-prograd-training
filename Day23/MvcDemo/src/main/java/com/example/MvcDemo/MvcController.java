package com.example.MvcDemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Controller
public class MvcController {
    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/dynamic")
    public String dynamic(Model model){
        int a=10;
        model.addAttribute("var",a);
        return "dynamic";
    }

    @RequestMapping("/add")
    public String add(){
        return "add";
    }

    @RequestMapping("/result")    //---->GetMapping w/o any attributes
    public String result(Model model, HttpServletRequest req){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int res = num1 + num2;
        model.addAttribute("res", res);
        return "result";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/details")
    public String details(Model model,HttpServletRequest req){
        String username= req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String address= req.getParameter("address");

//        Enumeration<String> enumeration = req.getHeaderNames();
//        while(enumeration.hasMoreElements()){
//            System.out.println(enumeration.nextElement());
//        }
//        while(enumeration.hasMoreElements()){
//            String headerName=(String) enumeration.nextElement();
//            String headerValue=req.getHeader(headerName);
//            System.out.println("<b>" + headerName + "</b>");
//            System.out.println((headerValue + "<br>"));

        model.addAttribute("username",username);
        model.addAttribute("email",email);
        model.addAttribute("address",address);

        return "details";
        }

    }



//Restful API
//  Url,Less
//--->GET-READ

  //Http header,more
//--->POST-CREATE (for sensitive data)
//--->PUT/PATCH-UPDATE
//--->DELETE- DELETE  (CRUD)
//RequestMapping knows how to get data and accessing/mapping web pages etc etc

//details put
//details get,post delete are different paths