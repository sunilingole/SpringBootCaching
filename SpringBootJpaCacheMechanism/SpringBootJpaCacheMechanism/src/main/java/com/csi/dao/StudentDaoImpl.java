package com.csi.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.csi.model.Student;
import com.csi.repo.StudentRepo;

@Component
public class StudentDaoImpl {
	@Autowired

	StudentRepo studentRepo;

	public void saveData(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
	}

	public Optional<Student> getDataById(int studentId) {
		// TODO Auto-generated method stub
		return studentRepo.findById(studentId);
	}

	public void updateData(Student student) {
		// TODO Auto-generated method stub
		studentRepo.save(student);
	}

	public void deleteDataById(int studentId) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(studentId);
	}
}
