package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Paese;

public interface PaeseService {

	List<Paese> getPaesi();
	
	List<Paese> getPaesiRandom(int num);
	
	Paese getPaeseByAlphaCode(String alpha);
	
	
}
