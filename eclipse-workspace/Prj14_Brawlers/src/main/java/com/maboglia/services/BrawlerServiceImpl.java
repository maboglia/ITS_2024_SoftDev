package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Brawler;
import com.maboglia.repos.BrawlerDAO;

@Service
public class BrawlerServiceImpl implements BrawlerService {

	@Autowired
	private BrawlerDAO dao;
	
	@Override
	public List<Brawler> getBrawlers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Brawler> getBrawlersByRarity(String rarity) {
		// TODO Auto-generated method stub
		return dao.findByRarity(rarity);
	}

	@Override
	public List<Brawler> getBrawlersByCarattere(String carattere) {
		// TODO Auto-generated method stub
		return dao.findByCarattere(carattere);
	}

	@Override
	public Brawler getBrawlerById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<String> getRarities() {
		// TODO Auto-generated method stub
		return dao
				.findAll()
				.stream()
				.map(b -> b.getRarity())
				.distinct()
				.sorted()
				.toList()
				;
	}

	@Override
	public List<String> getCaratteri() {
		// TODO Auto-generated method stub
		return null;
	}

}
