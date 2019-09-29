package com.guru.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.guru.student.dal.entites.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
