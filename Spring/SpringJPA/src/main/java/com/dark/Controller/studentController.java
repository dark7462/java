package com.dark.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.dark.Repository.StudentRepo;

@Controller
public class studentController {
	@Autowired
	StudentRepo repo;
	
	@GetMapping("/")
	public String home(ModelAndView m) {
		return "home";
	}
	@GetMapping("/getStudents")
	public String getStudents(Model m){
		m.addAttribute("students", repo.findAll());
		return "allStudent";
	}
	
	@GetMapping("/getStudentById")
	public String getStudentById(@RequestParam int id, Model m) {
		m.addAttribute("stu", repo.getById(id));
		return "output";
	}
}
