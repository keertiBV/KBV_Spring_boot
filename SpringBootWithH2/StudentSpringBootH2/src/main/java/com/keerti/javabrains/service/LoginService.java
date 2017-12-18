package com.keerti.javabrains.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerti.javabrains.model.Student;

@Service
public class LoginService {

	@Autowired
	private StudentService studentService;
	
	public boolean validateUser(String email, String password) {  
		List<Student> allStudentList = studentService.getAllStudents();
		boolean isValid=false;
		for(Student stud : allStudentList) {
			isValid=stud.getEmail().equalsIgnoreCase(email) && 
					stud.getPassword().equalsIgnoreCase(password);
		}
		
       return isValid;
    }

	
}
