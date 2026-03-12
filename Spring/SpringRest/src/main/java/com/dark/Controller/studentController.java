package com.dark.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dark.Repository.StudentRepo;
import com.dark.model.Student;


@RestController
public class studentController {
	@Autowired
	StudentRepo repo;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/students")
	public List<Student> getStudents(){
		return repo.findAll();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		
		return repo.getOne(id);
	}
	@PostMapping("/student")
	public void setStudent(@RequestBody Student s) {
		repo.save(s);
		System.out.println("added student");
	}
}
