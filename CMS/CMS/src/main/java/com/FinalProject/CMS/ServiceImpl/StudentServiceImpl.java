package com.FinalProject.CMS.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.FinalProject.CMS.Model.Student;
import com.FinalProject.CMS.Repository.StudentRepository;
import com.FinalProject.CMS.Service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(long id ) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudentById(long id) {
		studentRepository.deleteById(id);	
	}

}
	