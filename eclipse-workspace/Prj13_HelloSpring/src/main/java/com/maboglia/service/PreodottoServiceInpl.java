package com.maboglia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entites.Prodotto;
import com.maboglia.repos.ProdottoDAO;
@Service
public class PreodottoServiceInpl implements ProdottoService {

	@Autowired
	private ProdottoDAO dao;
	
	@Override
	public List<Prodotto> getProdotti() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Prodotto addProdotto(Prodotto p) {
		// TODO Auto-generated method stub
		return dao.save(p);
	}

}
