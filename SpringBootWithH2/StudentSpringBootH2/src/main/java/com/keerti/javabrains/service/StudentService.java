package com.keerti.javabrains.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerti.javabrains.model.Student;
import com.keerti.javabrains.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		List<Student> sList= new ArrayList<>();
		studentRepository.findAll().forEach(sList::add);
		return sList;
	}
	
	public void addNewStudent(Student student) {
		studentRepository.save(student);
	}	
	
}
