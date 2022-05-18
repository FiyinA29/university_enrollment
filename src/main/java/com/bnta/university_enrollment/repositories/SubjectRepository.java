package com.bnta.university_enrollment.repositories;

import com.bnta.university_enrollment.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
