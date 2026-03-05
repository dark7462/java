package com.dark;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.dark.model.Student;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		System.out.println("this is the home controller");
		return "index";
	}
	
	@GetMapping("/add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2")int j, Model m) {
		int sum = i + j;
		// model m will be responsible for the variables we maintain throughout the server
		m.addAttribute("sum",sum); 
		return "sum";
	}
	
	@GetMapping("addStudent")
	public String addStudent(@ModelAttribute Student stu) {
		return "student";
	}
}
