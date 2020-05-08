package com.example.psp.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.psp.model.Student;

@Service
public class StudentService 
{
	@Autowired
	StudentRepository repo;
	
	
	List<Student> list;
	
	public void loginStudent()
	{
		
	}
	
	public void logoutStudent()
	{
		
	}
	
	public List<Student> getStudents()
	{
		Iterator<Student> itr =  repo.findAll().iterator();
		list = new ArrayList<Student>();
		while(itr.hasNext())
		{
			list.add(itr.next());
		}
		return list;
	}
	
	public Student getStudent(String email)
	{
		
		
		Optional<Student> student = repo.findById(email);
		Student user = student.get();
		return user;
	}

	

	public void createStudent(Student student)
	{
		// TODO Auto-generated method stub
		repo.save(student);
	}
	
	
	public void updateStudent(Student student)
	{
		repo.save(student);
	}
	
	public void deleteStudent(String email)
	{
		repo.deleteById(email);
	}
	
	public void saveTechnicalMarks(String email, int technical_marks)
	{
		Student student = getStudent(email);
		student.setTechnical_marks(technical_marks);
		repo.save(student);
	}
	
	public void saveAptitudeMarks(String email, int aptitude_marks)
	{
		Student student = getStudent(email);
		student.setAptitude_marks(aptitude_marks);
		repo.save(student);
	}
	
	public void saveCommunicationMarks(String email, int communication_marks)
	{
		Student student = getStudent(email);
		student.setCommunication_marks(communication_marks);
		repo.save(student);
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		repo.deleteAll();
		
	}
	
	
	
}
