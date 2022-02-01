package com.project.BookMovieTickets.repository;

import com.project.BookMovieTickets.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,String> {
}
