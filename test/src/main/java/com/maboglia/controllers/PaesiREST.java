package com.maboglia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Paese;
import com.maboglia.services.PaeseService;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api")
public class PaesiREST {

	@Autowired
	private PaeseService service;
	
	@GetMapping("paesi")
	public ResponseEntity<List<Paese>>   getpaesi() {
		return new ResponseEntity<List<Paese>>(service.getPaesi(), HttpStatus.OK);
	}

	@GetMapping("paesi/{num}")
	public ResponseEntity<List<Paese>>   getpaesi(@PathVariable int num) {
		return new ResponseEntity<List<Paese>>(service.getPaesiRandom(num), HttpStatus.OK);
	}

	@GetMapping("paese")
	public ResponseEntity<Paese>   getpaese() {
		return new ResponseEntity<Paese>(service.getPaesiRandom(1).get(0), HttpStatus.OK);
	}
	
	
}
