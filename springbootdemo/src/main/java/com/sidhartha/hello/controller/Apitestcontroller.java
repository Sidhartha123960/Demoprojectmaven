package com.sidhartha.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genowti")
public class Apitestcontroller 
{

       @GetMapping("/welcome")	
	   public String welcome()
	   {
		   return "Hello, i'm from docker container"; 
	   }	
}