package com.example.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
public class Student {
	
	//@JsonProperty("STUDENT_ID")
	private int studentId;
	//@JsonProperty("STUDENT_NAME")
	private String studentName;
	//@JsonProperty("STUDENT_SKILL")
	private String studentSkill;
	

}
