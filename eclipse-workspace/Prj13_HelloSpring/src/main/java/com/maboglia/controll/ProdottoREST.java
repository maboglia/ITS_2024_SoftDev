package com.maboglia.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entites.Prodotto;
import com.maboglia.service.ProdottoService;

@RestController
public class ProdottoREST {
	@Autowired
	private ProdottoService service;
	
	
	@GetMapping("prodotti")
	List<Prodotto> getProdotti(){
		
		return service.getProdotti();
	}
	
	@PostMapping("prodotti")
	Prodotto addProdotto(@RequestBody Prodotto p) {
		
		return service.addProdotto(p);
	}
	
	
	@PostMapping("allprodotti")
	List<Prodotto> addProdotti(@RequestBody List<Prodotto> p) {
		
		for (Prodotto prodotto : p) {
			service.addProdotto(prodotto);
		}
		return service.getProdotti();
	}
	
}
