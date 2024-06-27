package com.maboglia.service;

import java.util.List;

import com.maboglia.entites.Prodotto;

public interface ProdottoService {

	List<Prodotto> getProdotti();
	Prodotto addProdotto(Prodotto p);
	
}
