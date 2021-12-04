package com.csi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue
	private int studentId;

	private String StudentName;

	private String studentBranch;

	private double studentFees;
}
