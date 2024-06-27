package repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Provincia;

public class ProvinciaDAOImpl implements ProvinciaDAO{

	Map<Integer, Provincia> province; 
	Connessione miaCon;
	Statement st;
	ResultSet rs;
	
	public ProvinciaDAOImpl() {
		miaCon = new Connessione();
		province = new HashMap<>(); 
		init();
	}
	
	private void init() {
		try {
			st = miaCon.getConn().createStatement();
			rs = st.executeQuery("SELECT * FROM province");
			while(rs.next()) {
				Provincia p = new Provincia();
				p.setId(rs.getInt("id"));
				p.setRegione(rs.getString("regione"));
				p.setComune(rs.getString("comune"));
				p.setMaschi(rs.getInt("maschi"));
				p.setFemmine(rs.getInt("femmine"));
				p.setTotale(rs.getInt("totale"));
				province.put(p.getId(), p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Override
	public List<String> getRegioni() {
		// TODO Auto-generated method stub
		return province
				.values()
				.stream()
				.map(p -> p.getRegione())
				.distinct()
				.sorted()
				.toList();
	}

	@Override
	public List<Provincia> getProvinceByRegione(String regione) {
		// TODO Auto-generated method stub
		return province
				.values()
				.stream()
				.filter(p -> p.getRegione().equals(regione))
				.toList();
	}

	@Override
	public Provincia getProvinciaById(int id) {
		// TODO Auto-generated method stub
		return province.get(id);
	}

}
