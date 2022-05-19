package com.bnta.university_enrollment.controllers;

import com.bnta.university_enrollment.models.Student;
import com.bnta.university_enrollment.models.Subject;
import com.bnta.university_enrollment.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private Student student;

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

    //POST (CREATE)
    @PostMapping
    public void createStudent(@RequestBody Student student){
        studentRepository.save(student);
    }

    //DELETE
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Long> deleteStudent(@PathVariable(value = "id") Long id) {
        studentRepository.deleteById(id);
        return ResponseEntity.ok(id);
    }
}
