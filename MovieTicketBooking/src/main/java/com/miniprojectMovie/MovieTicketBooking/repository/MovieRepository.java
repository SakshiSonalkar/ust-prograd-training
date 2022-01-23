package com.miniprojectMovie.MovieTicketBooking.repository;

import com.miniprojectMovie.MovieTicketBooking.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
