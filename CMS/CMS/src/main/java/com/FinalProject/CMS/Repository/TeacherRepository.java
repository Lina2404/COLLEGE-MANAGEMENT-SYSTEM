package com.FinalProject.CMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FinalProject.CMS.Model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}
