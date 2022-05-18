package com.bnta.university_enrollment.controllers;

import com.bnta.university_enrollment.models.Subject;
import com.bnta.university_enrollment.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("subjects")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    //INDEX
    @GetMapping
    public ResponseEntity<List<Subject>> getSubjects(){
        return new ResponseEntity<>(subjectRepository.findAll(), HttpStatus.OK);
    }
}
