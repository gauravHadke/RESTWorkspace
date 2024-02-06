package com.example.ne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	@Autowired
	B b;
	
	A(){
		System.out.println("Class A::Contructor");
	}
	
	void m1() {
		System.out.println("Class A :: method");
	}

}
