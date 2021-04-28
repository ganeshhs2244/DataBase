package com.learntogether.Database.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DatabaseController {
	@GetMapping("/getUser")
	public  String getEmployees()
	{
		return "employess";
	}

}
