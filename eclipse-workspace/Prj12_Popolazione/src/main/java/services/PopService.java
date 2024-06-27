package services;

import java.util.List;

import entities.Provincia;

public interface PopService {
	
	List<String> getRegioni();
	
	List<Provincia> getProvinceByRegione(String regione);
	
	Provincia getProvinciaById(int id);
	
	
	
	
	
	
	
	
	
	

}
