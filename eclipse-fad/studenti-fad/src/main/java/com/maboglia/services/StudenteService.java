package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Corso;
import com.maboglia.entities.Studente;

public interface StudenteService {

	List<Studente> getStudenti();
	Studente getStudente(int id);
	
	Studente addStudente(Studente s);
	
	List<Studente> getStudentiByCorso(int idCorso);
	
	Corso getCorso(int id);
}
