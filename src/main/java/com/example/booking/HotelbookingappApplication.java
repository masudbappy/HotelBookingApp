package com.example.booking;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class HotelbookingappApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(HotelbookingappApplication.class, args);
	}
}
