package com.miniprojectMovie.MovieTicketBooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class MovieShows {
    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private Time time;
    @JsonIgnore
    @ManyToOne
    private Movie movie;
    @OneToMany(mappedBy = "movieShows")
    private List<BookedSeats> bookedSeats;


    public MovieShows() {
    }

    public MovieShows(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public List<BookedSeats> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<BookedSeats> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
