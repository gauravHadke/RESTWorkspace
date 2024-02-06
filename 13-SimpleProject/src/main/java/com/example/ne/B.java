package com.example.ne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
	
	@Autowired
	A a;
	
	B(){
		System.out.println("Class B::Constructor");
	}

	void m2() {
		System.out.println("Class B :: method");
	}
}
