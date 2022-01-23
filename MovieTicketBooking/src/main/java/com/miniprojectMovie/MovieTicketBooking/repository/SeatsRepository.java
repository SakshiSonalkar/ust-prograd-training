package com.miniprojectMovie.MovieTicketBooking.repository;
import com.miniprojectMovie.MovieTicketBooking.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepository extends JpaRepository<Seats, Long> {
    public Seats getBySeats(String seats);
}
