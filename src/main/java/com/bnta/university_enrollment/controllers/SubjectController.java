package com.bnta.university_enrollment.controllers;

import com.bnta.university_enrollment.models.Student;
import com.bnta.university_enrollment.models.Subject;
import com.bnta.university_enrollment.repositories.SubjectRepository;
import org.hibernate.annotations.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("subjects")
public class SubjectController {

    @Autowired
    private SubjectRepository subjectRepository;

    //INDEX
    @GetMapping
    public ResponseEntity<List<Subject>> getAllSubjectsAndFilters(@RequestParam(required = false, name = "title") String title){
        if (title!= null){
            return new ResponseEntity<>(subjectRepository.findByTitle(title), HttpStatus.OK);
        }
        return new ResponseEntity<>(subjectRepository.findAll(), HttpStatus.OK);
    }

    //SHOW
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Subject>> getStudent(@PathVariable Long id){
        var subject = subjectRepository.findById(id);
        return new ResponseEntity<>(subject, subject.isEmpty() ? HttpStatus.NOT_FOUND : HttpStatus.OK);
    }

    //POST (CREATE)
    @PostMapping
    public void createSubject(@RequestBody Subject subject){
        subjectRepository.save(subject);
    }

    //DELETE
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Optional<Subject>> deleteSubject(@PathVariable Long id){
        subjectRepository.deleteById(id);
        return new ResponseEntity<>(subjectRepository.findById(id), HttpStatus.OK);
    }
}
