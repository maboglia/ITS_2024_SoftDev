package com.maboglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Studente;

public interface StudenteDAO extends JpaRepository<Studente, Integer> {

	List<Studente> findByNomeContaining(String nome);//derived query
	
}
