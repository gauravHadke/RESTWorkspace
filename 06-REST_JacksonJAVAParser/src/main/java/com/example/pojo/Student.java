package com.example.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
//@AllArgsConstructor
//@XmlRootElement
public class Student {

	@JsonProperty("STUDENT_ID")
	private int studentId;
	private String studentName;
	private String studentSkill;
}
