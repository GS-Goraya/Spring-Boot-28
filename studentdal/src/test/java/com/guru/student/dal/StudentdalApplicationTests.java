package com.guru.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.guru.student.dal.entites.Student;
import com.guru.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("jony");
		student.setCourse("hiber");
		student.setFee(2201d);
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(1l);
		System.out.println(student);

	}

	@Test
	public void testUpdateStudent() {
		Optional<Student> student = studentRepository.findById(1l);
		student.get().setFee(454d);

	}

	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(1l);
		studentRepository.delete(student);

	}

}
