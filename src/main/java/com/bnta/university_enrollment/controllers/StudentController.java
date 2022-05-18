package com.bnta.university_enrollment.controllers;

import com.bnta.university_enrollment.models.Student;
import com.bnta.university_enrollment.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    //INDEX
    @GetMapping
    public ResponseEntity<List<Student>> getStudent(){
        return new ResponseEntity<>(studentRepository.findAll(), HttpStatus.OK);
    }

    //SHOW
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>> getStudent(@PathVariable Long id){
        var student = studentRepository.findById(id);
        return new ResponseEntity<>(student, student.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }
}
