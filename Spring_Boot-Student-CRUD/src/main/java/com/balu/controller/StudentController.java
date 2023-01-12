package com.balu.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.balu.entity.Student;
import com.balu.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PutMapping("/student")
	private int saveStudent(@RequestBody Student student) {
	studentService.saveOrUpdate(student);
	return student.getId();
	}
	
	@GetMapping("/student/{id}")private Student getStudent(@PathVariable("id")int id) {
	return studentService.getStudentById(id);
	}
	
	@GetMapping("/student_list")
	private List<Student> getAllStudents(){
	return studentService.getAllStudents();
	}
	
	@PutMapping("/stud")
	private Student update(@RequestBody Student s) {
	studentService.saveOrUpdate(s);
	return s;
	}
	
	@DeleteMapping("/student/{id}")
	private void deleteStudent(@PathVariable("id") int id) {
	studentService.delete(id);
	}
}
