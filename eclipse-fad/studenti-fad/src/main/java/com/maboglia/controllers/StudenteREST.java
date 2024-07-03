package com.maboglia.controllers;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Studente;
import com.maboglia.services.StudenteService;

@RestController
@RequestMapping("api")
public class StudenteREST {

	@Autowired
	private StudenteService service;
	
	@GetMapping("students")
	public ResponseEntity<List<Studente>> getStudenti(){
		return new ResponseEntity<List<Studente>>(service.getStudenti(), HttpStatus.OK);
	}
	
	@PostMapping("students")
	public Studente addStudente(@RequestBody Studente s) {
		return service.addStudente(s);
	}
	
}
