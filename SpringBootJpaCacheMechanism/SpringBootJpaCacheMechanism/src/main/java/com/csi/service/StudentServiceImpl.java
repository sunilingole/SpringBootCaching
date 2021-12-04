package com.csi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.csi.dao.StudentDaoImpl;
import com.csi.model.Student;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class StudentServiceImpl {
	@Autowired

	StudentDaoImpl studentDaoImpl;

	public void saveData(Student student) {
		// TODO Auto-generated method stub
		studentDaoImpl.saveData(student);
	}

	@Cacheable(value = "studentId")

	public Optional<Student> getDataById(int studentId) {

		log.info("*************Getting student data by id*****************");
		// TODO Auto-generated method stub
		return studentDaoImpl.getDataById(studentId);
	}

	public void updateData(Student student) {
		// TODO Auto-generated method stub
		studentDaoImpl.updateData(student);
	}

	public void deleteDataById(int studentId) {
		// TODO Auto-generated method stub
		studentDaoImpl.deleteDataById(studentId);
	}

}
