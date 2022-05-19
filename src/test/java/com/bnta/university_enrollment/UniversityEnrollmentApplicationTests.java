package com.bnta.university_enrollment;

import com.bnta.university_enrollment.repositories.StudentRepository;
import com.bnta.university_enrollment.repositories.SubjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class UniversityEnrollmentApplicationTests {

	@Autowired
	private SubjectRepository subjectRepository;
	@Autowired
	private StudentRepository studentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testFindByTitle() {
		assertThat(subjectRepository.findByTitle("Mathematics").size()).isEqualTo(1);
	}

	@Test
	public void testFindBySurname() {
		assertThat(studentRepository.findBySurname("Possible").size()).isEqualTo(1);
	}
}
