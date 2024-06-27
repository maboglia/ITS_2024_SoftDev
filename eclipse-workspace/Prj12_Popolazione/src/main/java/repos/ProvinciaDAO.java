package repos;

import java.util.List;

import entities.Provincia;

public interface ProvinciaDAO {

	List<String> getRegioni();
	List<Provincia> getProvinceByRegione(String regione);
	Provincia getProvinciaById(int id);
	
}
