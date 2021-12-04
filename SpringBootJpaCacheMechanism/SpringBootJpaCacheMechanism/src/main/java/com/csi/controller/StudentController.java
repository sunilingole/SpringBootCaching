package com.csi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.model.Student;
import com.csi.service.StudentServiceImpl;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentServiceImpl studentServiceImpl;

	@PostMapping("/savedata")
	public String saveData(@RequestBody Student student) {
		studentServiceImpl.saveData(student);
		return "Data Saved successfully";
	}

	@GetMapping("/getdatabyId/{studentId}")
	public Optional<Student> getDataById(@PathVariable int studentId) {
		return studentServiceImpl.getDataById(studentId);
	}

	@PutMapping("/updatedata/{studentId}")
	public ResponseEntity<String> updateData(@PathVariable int studentId, @RequestBody Student student) {

		studentServiceImpl.updateData(student);
		return ResponseEntity.ok("data updated sucessfully ");

	}

	@DeleteMapping("/deletedatabyid/{studentId}")
	public ResponseEntity<String> deleteDataById(@PathVariable int studentId) {

		studentServiceImpl.deleteDataById(studentId);

		return ResponseEntity.ok(" data deleted successfuly");
	}
}
