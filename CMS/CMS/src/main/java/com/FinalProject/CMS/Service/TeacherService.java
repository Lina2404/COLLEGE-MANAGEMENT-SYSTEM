package com.FinalProject.CMS.Service;

import java.util.List;

import com.FinalProject.CMS.Model.Teacher;

public interface TeacherService {
	
List<Teacher> getAllTeachers();
	
	Teacher saveTeacher(Teacher teacher);
	
	Teacher getTeacherById(Long id);
	
	Teacher updateTeacher(Teacher teacher);

	void deleteTeacherById(Long id);
	

}
