package com.example.psp.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.psp.model.Student;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StudentController 
{
	@Autowired
	StudentService studentService;
	
	
	@GetMapping("students")
	public List<Student> getStudents()
	{
		try {
			return studentService.getStudents();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	@GetMapping("students/{email}")
	public Student getStudent(@PathVariable("email") String email)
	{
		
		StudentResponse response;
		try {
			return studentService.getStudent(email); 
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@PostMapping("createStudent")
	public StudentResponse createStudent(@RequestBody Student student)
	{
		StudentResponse response;
		try {
			//User Created 
			studentService.createStudent(student);

			//Response to the user
			response = new StudentResponse(student.getEmail(), student.getFirstName(), student.getLastName(), "User Created Successfully");
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			response = new StudentResponse(student.getEmail(), student.getFirstName(), student.getLastName(), "Error in created user");
			return response;
			
		}
		 
	}
	
	@PutMapping("updateStudent")
	public StudentResponse updateStudent(@RequestBody Student student)
	{
		StudentResponse response;
		
		try {
			//Student updated
			studentService.updateStudent(student);
			
			// Reponse to the user
			response = new StudentResponse(student.getEmail(), student.getFirstName(), student.getLastName(), "User Details Updated Successfully");
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			response = new StudentResponse(student.getEmail(), student.getFirstName(), student.getLastName(), "Error in updating user");
			return response;
		}
	}
	
	@DeleteMapping("deleteStudent/{email}")
	public StudentResponse deleteStudent(@PathVariable("email") String email)
	{
		StudentResponse response;
		
		try {
			//Delete user
			studentService.deleteStudent(email);
			
			//Response to the user
			response = new StudentResponse(email, "","", "User With the email address deleted");
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			response = new StudentResponse(email,"","", "Error in deleting user");
			return response;
		}
		
	}
}
