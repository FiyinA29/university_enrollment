package com.bnta.university_enrollment.components;

import com.bnta.university_enrollment.models.Student;
import com.bnta.university_enrollment.repositories.ClassRepository;
import com.bnta.university_enrollment.repositories.StudentRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


public class DataLoader implements ApplicationRunner {

    private StudentRepository studentRepository;
    private ClassRepository classRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
