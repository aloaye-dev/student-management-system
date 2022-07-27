package com.javaproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
