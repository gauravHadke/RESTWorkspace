package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class HomeController {

	@RequestMapping(value = "/upload-file")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile multipartFile)
	{
		System.out.println(multipartFile.getOriginalFilename()+" "+
						   multipartFile.getSize()+" "+multipartFile.getName()+" "+
						   multipartFile.getContentType());
		return ResponseEntity.ok("Working");
	}
} 
