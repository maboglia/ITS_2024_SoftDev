package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entites.Prodotto;
@Repository
public interface ProdottoDAO extends JpaRepository<Prodotto, Integer>{

	
	
}
