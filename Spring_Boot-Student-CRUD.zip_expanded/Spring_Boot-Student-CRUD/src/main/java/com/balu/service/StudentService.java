package com.balu.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.balu.entity.Student;
import com.balu.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	//save the student
	public void saveOrUpdate(Student s) {
	studentRepository.save(s);
	}
	
	public Student getStudentById(int id) {
	return studentRepository.findById(id).orElseThrow(()->new
	RuntimeException("Student_Id not found!!!"));
	}
	
	public List<Student> getAllStudents(){
	List<Student> students=new ArrayList<Student>();
	studentRepository.findAll().forEach(stud->students.add(stud));
	return students; 
	}
	
	public void update(Student s1, int id) {
	studentRepository.save(s1); 
	}
	
	public void delete(int id) {
	studentRepository.deleteById(id);//orElseThrow(()->newRuntimeException("Order_Id not found!!!"));

	}
	
}
