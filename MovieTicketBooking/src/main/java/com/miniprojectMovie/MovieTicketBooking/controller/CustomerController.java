package com.miniprojectMovie.MovieTicketBooking.controller;

import com.miniprojectMovie.MovieTicketBooking.entity.Customer;
import com.miniprojectMovie.MovieTicketBooking.service.CustomerService;
import com.miniprojectMovie.MovieTicketBooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private MovieService movieService;

    //Home
    @GetMapping("/")
    public String home(){
        return "home";
    }

    //Registration- after registering user will go to login page
    @GetMapping("/register")
    public String registrationForm() {
        return "register";
    }

    @PostMapping("/login")
    public String registration(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String password = request.getParameter("password");
        Customer customer = new Customer(userName, name, address, password);
        customerService.createCustomer(customer);
        return "login";
    }

    //Login - after login user will go to the list of movies page
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @GetMapping("/movies")
    public String movies(Model model){
        model.addAttribute("movies",movieService.movieList());
        return "movies";
    }

    @PostMapping("/movies")
    public String login(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Customer customer;
        if (customerService.existsById(userName)) {
            customer = customerService.findCustomerByUserName(userName);
            if (password.equals(customer.getPassword())) {
                model.addAttribute("userName", userName);
                model.addAttribute("movies", movieService.movieList() );
            } else {
                model.addAttribute("message", "Wrong Password");
                return "login";
                //return "redirect:/login";
            }
        } else {
            model.addAttribute("message", "Please enter valid User Name");
            return "login";
            //return "redirect:/login";
        }
        return "movies";
    }




}
