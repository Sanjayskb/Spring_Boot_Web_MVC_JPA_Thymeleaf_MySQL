package com.sanjay.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sanjay.sms.entity.Student;
import com.sanjay.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Sanjay","Bhagchandani","abc@gmail.com");	
		Student student2 = new Student("Krishna","Panchal","def@gmail.com");	
		Student student3 = new Student("Utsav","Gajjar","ghi@gmail.com");	
		Student student4 = new Student("Rishabh","Khale","jkl@gmail.com");	
		Student student5 = new Student("Kushal","Thakar","mno@gmail.com");	
		
		/*
		 * studentRepository.save(student1); studentRepository.save(student2);
		 * studentRepository.save(student3); studentRepository.save(student4);
		 * studentRepository.save(student5);
		 */
		
	}

}
