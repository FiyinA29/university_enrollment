package com.bnta.university_enrollment.repositories;

import com.bnta.university_enrollment.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
