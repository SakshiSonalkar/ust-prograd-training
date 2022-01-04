package com.example.relations.service;


import com.example.relations.entity.Faculty;
import com.example.relations.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepo;

    public List<Faculty> getAllFaculties(){
        return facultyRepo.findAll();
    }

    public Faculty save(Faculty faculty){
        return facultyRepo.save(faculty);
    }

    public Faculty getFacultyById(Long facultyId){
        return facultyRepo.findById(facultyId).get();
    }
}
