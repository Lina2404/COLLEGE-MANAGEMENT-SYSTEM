package com.FinalProject.CMS.Service;

import java.util.List;

import com.FinalProject.CMS.Model.Student;

public interface StudentService {
	
List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(long id);
	
	Student updateStudent( long id);
	
	void deleteStudentById(long id);
}
