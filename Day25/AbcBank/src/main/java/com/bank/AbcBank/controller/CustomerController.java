package com.bank.AbcBank.controller;

import com.bank.AbcBank.entity.Account;
import com.bank.AbcBank.entity.Customer;
import com.bank.AbcBank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class CustomerController {
    String userName;
    String customerName;
    String phoneNumber;
    String password;
    @Autowired
    private CustomerService service;

    @RequestMapping("/home")
    public String login() {
        return "home";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("fundTransfer")
    public String fundTransfer(){
        return "fundTransfer";
    }

    @RequestMapping("/account")
    public String addAccount() {
        return "account";
    }

    @PostMapping("/home")
    public String loginAsCustomer(HttpServletRequest request,Model model) {
        userName = request.getParameter("Uname");
        password = request.getParameter("Psw");
        Customer customer = service.findByCustomerId(userName);
        if (!(Objects.isNull(customer))) {
            if (customer.getPassword().equals(password)) {
                model.addAttribute("message", "Login Successful");
                return "accountDetails";
            } else {
                model.addAttribute("message", "Enter valid details");
                return "home";
            }
        } else {
            model.addAttribute("message", "Enter valid details");
            return "home";
        }
    }


    @RequestMapping("/accountDetails")
    public String details(HttpServletRequest request,Model model){
        Customer customer= service.findByCustomerId(request.getParameter("Uname"));
        if(customer.getUserName().equals(request.getParameter("Uname"))){
         model.addAttribute("message","AccountDetails given below");
            model.addAttribute("message","Account added successfully");
            model.addAttribute("name",customer.getCustomerName());
            model.addAttribute("Uname",customer.getUserName());
            model.addAttribute("phone",customer.getPhoneNumber());
            model.addAttribute("accountType",customer.getAccount().getAccountType());
            model.addAttribute("ifsc",customer.getAccount().getIfscCode());
            model.addAttribute("branchName",customer.getAccount().getBranchName());
            model.addAttribute("balance",customer.getAccount().getAccountBalance());
            return "accountDetails";
        }else{
          model.addAttribute("message","Login before checking accountDetails");
          return "home";
        }
    }


    @RequestMapping("/registeredCustomer")
    public String registeredCustomer( HttpServletRequest request, Model model){
        Customer customer= service.findByCustomerId(request.getParameter("Uname"));
        if(customer.getUserName().equals(request.getParameter("Uname"))){
            return "registeredCustomer";
        }else{
            model.addAttribute("message","Invalid Credentials");
            return "register";
        }
    }


        @PostMapping("/registeredCustomer")
        public String registration(HttpServletRequest request, Model model) {
            if (request.getParameter("Psw").equals(request.getParameter("psw-repeat"))) {
                userName = request.getParameter("Uname");
                customerName = request.getParameter("name");
                phoneNumber = request.getParameter("phone");
                password = request.getParameter("Psw");
                Customer customer= new Customer(customerName,userName,phoneNumber,password);
                service.saveCustomer(customer);
                    model.addAttribute("message", "CustomerDetails given below");
                    model.addAttribute("name", customer.getCustomerName());
                    model.addAttribute("Uname", customer.getUserName());
                    model.addAttribute("phone", customer.getPhoneNumber());
                    return "registeredCustomer";
                }
             else {
                model.addAttribute("message","Registration details invalid");
                return "register";
            }
        }

        @PostMapping("/accountDetails")
        public String addAccount(HttpServletRequest request,Model model){
            Customer customer = service.findByCustomerId(request.getParameter("Uname"));
            if(customer.getUserName().equals(request.getParameter("Uname"))){
                String accountType=request.getParameter("accountType");
                String ifscCode =request.getParameter("ifsc");
                String branchName = request.getParameter("branchName");
                Double balance=Double.parseDouble(request.getParameter("balance"));
                Account account = new Account(customer.getCustomerName(),customer.getPhoneNumber(),balance,customer,customer.getUserName(),accountType,branchName,ifscCode);
                customer.setAccount(account);
                service.saveAccount(account);
                account.setCustomer(customer);
                model.addAttribute("message","Account added successfully");
                model.addAttribute("name",customer.getCustomerName());
                model.addAttribute("Uname",customer.getUserName());
                model.addAttribute("phone",customer.getPhoneNumber());
                model.addAttribute("accountType",accountType);
                model.addAttribute("ifsc",ifscCode);
                model.addAttribute("branchName",branchName);
                model.addAttribute("balance",balance);
                return "accountDetails";
            }
            else{
                model.addAttribute("message","Register first");
                return "account";
            }
        }


    }
