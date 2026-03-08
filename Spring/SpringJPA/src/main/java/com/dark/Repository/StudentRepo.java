package com.dark.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dark.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	//this will provide you with most of the simple methods you want (CURD)
}
