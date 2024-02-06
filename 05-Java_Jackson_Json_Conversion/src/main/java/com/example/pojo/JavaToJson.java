   package com.example.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		convertStudentObjToJson();
	}

	private static void convertStudentObjToJson() throws JsonProcessingException {
		Student s = new Student();
		
		s.setStudentId(111);
		s.setStudentName("Rocky");
		s.setStudentSkill("Python");
		

		Student s1 = new Student();
		s1.setStudentId(222);
		s1.setStudentName("Jasmin");
		s1.setStudentSkill("Mysql");
		

		Student s2 = new Student();
		s2.setStudentId(333);
		s2.setStudentName("Vaibhav");
		s2.setStudentSkill("AWS");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s);list.add(s1);list.add(s2);
		
		for(Student std:list) {
			System.out.println(std.getStudentId());
			System.out.println(std.getStudentName());
		}
		
		ObjectMapper om=new ObjectMapper();
		
		String str = om.writeValueAsString(list);
		System.out.println(str);
		
		//for format the json data properly
		String string = om.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		System.out.println(string);
	}

}
