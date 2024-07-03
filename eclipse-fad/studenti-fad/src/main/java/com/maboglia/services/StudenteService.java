package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Studente;

public interface StudenteService {

	List<Studente> getStudenti();
	Studente getStudente(int id);
	
	Studente addStudente(Studente s);
	
}
