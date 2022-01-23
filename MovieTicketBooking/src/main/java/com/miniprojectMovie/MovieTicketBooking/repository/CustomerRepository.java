package com.miniprojectMovie.MovieTicketBooking.repository;

import com.miniprojectMovie.MovieTicketBooking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
