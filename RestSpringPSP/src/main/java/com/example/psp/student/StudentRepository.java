package com.example.psp.student;

import org.springframework.data.repository.CrudRepository;

import com.example.psp.model.Student;


public interface StudentRepository extends CrudRepository<Student, String> 
{
	
}
