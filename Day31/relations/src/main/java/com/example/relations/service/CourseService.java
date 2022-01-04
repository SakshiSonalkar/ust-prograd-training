package com.example.relations.service;

import com.example.relations.entity.Course;
import com.example.relations.entity.Faculty;
import com.example.relations.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CourseService {
    @Autowired
    private CourseRepository repo;
    public Course save(Course course) {
        return repo.save(course);
    }

    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    public Course getCourseById(Long id) {
        return repo.findById(id).get();
    }
}
