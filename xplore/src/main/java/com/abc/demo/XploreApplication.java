package com.abc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.abc.demo")
public class XploreApplication {

	public static void main(String[] args) {
		SpringApplication.run(XploreApplication.class, args);
	}

}
