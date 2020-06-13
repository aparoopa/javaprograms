package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binsrch = new BinarySearchImpl();
		int result= binsrch.binarysrch(new int[] {12,4,6},3);
		System.out.println(result);
		SpringApplication.run(DemoApplication.class, args);
		//System.out.println("Hello World");
	}

}
