package com.bnta.university_enrollment.components;

import com.bnta.university_enrollment.models.Subject;
import com.bnta.university_enrollment.models.Student;
import com.bnta.university_enrollment.repositories.SubjectRepository;
import com.bnta.university_enrollment.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SubjectRepository subjectRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Student student1 = new Student("Peter", "Parker", LocalDate.of(1988, 9, 29));
        Student student2 = new Student("Mary-Jane", "Watson", LocalDate.of(1989, 2, 17));
        Student student3 = new Student("Kim", "Possible", LocalDate.of(1987, 12, 6));
        Student student4 = new Student("Ron", "Stoppable", LocalDate.of(1987, 6, 13));
        studentRepository.saveAll(Arrays.asList(student1, student2, student3, student4));

        Subject subject1 = new Subject("Mathematics", "Statistics and engineering maths", Arrays.asList(student1, student4));
        Subject subject2 = new Subject("Computing", "Practical and theoretical programming", Arrays.asList(student2, student3));
        Subject subject3 = new Subject("Science", "Biology, chemistry and physics", Arrays.asList(student2));
        Subject subject4 = new Subject("Social Studies", "Greek and Roman history", Arrays.asList(student4));
        subjectRepository.saveAll(Arrays.asList(subject1, subject2, subject3, subject4));

    }
}
