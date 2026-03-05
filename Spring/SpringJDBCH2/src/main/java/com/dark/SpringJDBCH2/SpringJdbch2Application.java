package com.dark.SpringJDBCH2;

import com.dark.SpringJDBCH2.Component.Student;
import com.dark.SpringJDBCH2.Repository.studentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbch2Application {

	public static void main(String[] args) {

        ApplicationContext ac = SpringApplication.run(SpringJdbch2Application.class, args);

        Student s1 = ac.getBean(Student.class);
        s1.setId(1);
        s1.setName("Dark");


        studentRepo repo = ac.getBean(studentRepo.class);

        repo.save(s1);
        System.out.println(repo.findAll());


	}

}
