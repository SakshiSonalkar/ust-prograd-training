package com.example.repoTest.repository;

import com.example.repoTest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Long> {
    @Query(
           "SELECT CASE When COUNT(s) > 0 THEN TRUE ELSE FALSE END " +
            "FROM Student s WHERE s.email = ?1"           //first argument in function call
    )                                                     //?2 means second parameter in function call
    public Boolean checkIfEmailExists(String email);
}
