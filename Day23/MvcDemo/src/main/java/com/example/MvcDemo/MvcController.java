package com.example.MvcDemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/result")
    public String result(Model model, HttpServletRequest req){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));

        int res = num1 + num2;
        model.addAttribute("res", res);
        return "result";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
