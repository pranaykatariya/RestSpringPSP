package com.example.psp.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.psp.model.Student;
import com.example.psp.model.StudentMark;

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
	
	
//	@PostMapping("updateMarks")
	@RequestMapping(value = "/updateMarks", consumes = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.POST)
	public void updateStudentMarks(@RequestBody StudentMark studentMark)
	{
		
		System.out.println("here");
		System.out.println(studentMark);
		System.out.println(studentMark.getEmail());
		System.out.println(studentMark.getHSCMaths());
	}

	@PostMapping("createStudent")
	public StudentResponse createStudent(@RequestBody Student student)
	{
		System.out.println(student.getHSC_Percentage());
		System.out.println(student.getHSC_Maths());
		StudentResponse response;
		try {
			//User Created 
			System.out.println(student);
			if(this.getStudent(student.getEmail()) == null)
			{
				studentService.createStudent(student);
				response = new StudentResponse(student.getEmail(), student.getFirstName(), student.getLastName(), "User Created Successfully");
			}else
			{
				response = new StudentResponse(student.getEmail(), student.getFirstName(), student.getLastName(), "User already exist");
			}

			//Response to the user
			
			return response;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
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
	
	
	@GetMapping("deleteStudents")
	public void deleteAllStudents()
	{
		System.out.println("Deleting all students");
		studentService.deleteAll();
		
	}
}
