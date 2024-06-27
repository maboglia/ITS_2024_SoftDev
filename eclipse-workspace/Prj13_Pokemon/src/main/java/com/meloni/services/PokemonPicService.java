package com.meloni.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meloni.entities.PokemonPic;
import com.meloni.repos.PokemonPicDAO;

@Service
public class PokemonPicService {
	
	@Autowired
	private PokemonPicDAO dao;
	
	public List<PokemonPic> getPokemon(){
		return dao.findAll(); 
	
	}
	
	public Optional<PokemonPic> getPokemonByName(String name) {
        return dao.findByName(name);
	
	
	
	}
}
