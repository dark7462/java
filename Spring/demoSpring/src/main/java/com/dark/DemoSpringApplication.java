package com.dark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSpringApplication.class, args);
		
		Student stu = context.getBean(Student.class);
		// Beans are responsible to make Objects in spring and spring handles all the object related work
		
		stu.code();
		
	}

}
