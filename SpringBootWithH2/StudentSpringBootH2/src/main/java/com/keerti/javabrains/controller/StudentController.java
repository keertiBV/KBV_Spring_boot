package com.keerti.javabrains.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.keerti.javabrains.model.Student;
import com.keerti.javabrains.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/success")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/student")
	public void addNewStudent(@RequestBody Student student) {
		studentService.addNewStudent(student);
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
    public String showRegisterPage(ModelMap model){
        return "register";
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/register")
	public String regitserStudent(ModelMap model, @RequestParam String firstName, @RequestParam String lastName, 
			@RequestParam String gender, @RequestParam String email, @RequestParam String password) {
		
		model.put("firstName", firstName);
		model.put("lastName", lastName);
		model.put("gender", gender);
		model.put("email", email);
		model.put("password", password);
		
		Student s=new Student();
		s.setFirstName(firstName);
		s.setLastName(lastName);
		s.setGender(gender);;
		s.setEmail(email);
		s.setPassword(password);		
				
		studentService.addNewStudent(s);
		return "success";
		
	}
	
	@RequestMapping(value = "/listStudents", method = RequestMethod.GET)
	public ModelAndView employees() {
		List<Student> allStudentList = studentService.getAllStudents();
		return new ModelAndView("listStudents", "studentList", allStudentList);

	}
	
	
}
