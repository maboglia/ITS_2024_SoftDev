package com.maboglia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Router {

	@GetMapping("")
	public String home() {
		return "home";
	}
	
	@GetMapping("quiz-capitali")
	public String quizCapitali() {
		return "quiz-capitali";
	}
	
	@GetMapping("quiz-bandiere")
	public String quizBandiere() {
		return "quiz-bandiere";
	}
	
	@GetMapping("training-capitali")
	public String trainingCapitali() {
		return "training-capitali";
	}
	
	@GetMapping("training-bandiere")
	public String trainingBandiere() {
		return "training-bandiere";
	}
}
