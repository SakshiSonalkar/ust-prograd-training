package com.project.BookMovieTickets.controller;

import com.project.BookMovieTickets.service.MovieService;
import com.project.BookMovieTickets.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TicketController {
    @Autowired
    public TicketService ticketService;

    @Autowired
    public MovieService movieService;
}