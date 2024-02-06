package com.example.pojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		convertJsonDataIntoJavaObject();
	}

	private static void convertJsonDataIntoJavaObject() throws IOException, StreamReadException, DatabindException {
		File file = new File("src/main/resources/readFile.json");
		ObjectMapper mapper = new ObjectMapper();
		Student student[] = mapper.readValue(file, Student[].class);
		for(Student s:student)
		{
			System.out.println(s.getStudentId());
			System.out.println(s.getStudentName());
			System.out.println(s.getStudentSkill());
		}
	}

}
