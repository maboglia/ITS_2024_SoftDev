package com.meloni.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meloni.entities.PokemonPic;
import com.meloni.services.PokemonPicService;

@RestController
public class PokemonPicREST {
	
	@Autowired
	private PokemonPicService service;
	
	@GetMapping("pokemon")
	public List<PokemonPic> getPokemonPics(){
		return service.getPokemon();
	}
	
	 @GetMapping("/pokemon/{name}")
	    public ResponseEntity<PokemonPic> getPokemonByName(@PathVariable String name) {
	        Optional<PokemonPic> pokemonPic = service.getPokemonByName(name);
	        return pokemonPic.map(ResponseEntity::ok)
	                         .orElseGet(() -> ResponseEntity.notFound().build());
	 }
}
	 
