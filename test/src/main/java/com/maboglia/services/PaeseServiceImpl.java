package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Paese;
import com.maboglia.repos.PaeseDAO;

@Service
public class PaeseServiceImpl implements PaeseService {

	@Autowired
	private PaeseDAO dao;
	
	
	@Override
	public List<Paese> getPaesi() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Paese> getPaesiRandom(int num) {
		// TODO Auto-generated method stub
		return dao.getPaesiRandom(num);
	}

	@Override
	public Paese getPaeseByAlphaCode(String alpha) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(alpha);
	}

}
