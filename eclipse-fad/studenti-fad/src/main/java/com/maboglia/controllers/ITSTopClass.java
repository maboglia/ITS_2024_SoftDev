package com.maboglia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maboglia.services.StudenteService;

@Controller
public class ITSTopClass {

	@Autowired
	private StudenteService service;
	
	@GetMapping("students")
	public String students(Model m) {
		m.addAttribute("titolo", "Gli studenti del corso");
		m.addAttribute("studenti", service.getStudenti());
		return "students_view";
	}
	
	
}
