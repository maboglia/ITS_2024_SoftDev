package services;

import java.util.List;

import entities.Provincia;
import repos.ProvinciaDAO;
import repos.ProvinciaDAOImpl;

public class PopServiceImpl implements PopService {

	ProvinciaDAO dao = new ProvinciaDAOImpl();
	
	@Override
	public List<String> getRegioni() {
		return dao.getRegioni();
	}

	@Override
	public List<Provincia> getProvinceByRegione(String regione) {
		return dao.getProvinceByRegione(regione);
	}

	@Override
	public Provincia getProvinciaById(int id) {
		return dao.getProvinciaById(id);
	}

}
