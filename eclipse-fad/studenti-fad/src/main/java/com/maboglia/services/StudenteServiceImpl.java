package com.maboglia.services;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Studente;
import com.maboglia.repos.StudenteDAO;

@Service
public class StudenteServiceImpl implements StudenteService {
	
	@Autowired
	private StudenteDAO dao;
	
	private Map<Integer, Studente> mappa = new TreeMap<>();

	@Override
	public List<Studente> getStudenti() {
		return dao.findAll();
	}

	@Override
	public Studente getStudente(int id) {

		if( dao.findById(id).isPresent())
			return dao.findById(id).get();
		
		return null;
	}

	@Override
	public Studente addStudente(Studente s) {
		
		return dao.save(s);
	}

}
