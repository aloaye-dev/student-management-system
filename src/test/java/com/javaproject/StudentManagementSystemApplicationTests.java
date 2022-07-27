package com.javaproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.javaproject.entity.Student;
import com.javaproject.repository.StudentRepository;

import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootTest
@SpringBootApplication
public class StudentManagementSystemApplicationTests implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplicationTests.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Ephraim", "Ugiomoh"," lilraimy@gmail.com");
//		studentRepository.save(student1);
//		
	}

	
}
