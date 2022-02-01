package com.project.BookMovieTickets.service;

import com.project.BookMovieTickets.entity.Movies;
import com.project.BookMovieTickets.repository.MovieRepository;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired()
    public MovieRepository movieRepository;

    public List<Movies> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movies save(Movies movies) {
        return movieRepository.save(movies);
    }

    public Movies getMovieById(String movieId) {
        return movieRepository.findById(movieId).get();
    }

    public List<Movies> getMoviesByName(String movie) {
        return movieRepository.findByMovieName(movie);

    }

}
