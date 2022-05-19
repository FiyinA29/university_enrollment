package com.bnta.university_enrollment.repositories;

import com.bnta.university_enrollment.models.Student;
import com.bnta.university_enrollment.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findBySurname(String surname);
}
