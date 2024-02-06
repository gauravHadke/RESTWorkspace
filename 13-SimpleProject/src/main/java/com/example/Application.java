package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.ne.A;
import com.example.ne.B;
//By Default spring doesnot allow circular ref of dependancies We have to add it in properties file
//spring.main.allow-circular-rf=true
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		A a = run.getBean(A.class);
		System.out.println(a);
		B b=run.getBean(B.class);
		System.out.println(b);
		
	}
}
