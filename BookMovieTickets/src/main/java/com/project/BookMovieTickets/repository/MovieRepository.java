package com.project.BookMovieTickets.repository;

import com.project.BookMovieTickets.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movies,String> {
    List<Movies> findByMovieName(String movie);
}
