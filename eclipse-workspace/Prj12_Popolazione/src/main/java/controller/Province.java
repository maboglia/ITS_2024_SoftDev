package controller;

import java.io.IOException;
import java.util.List;

import entities.Provincia;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.PopService;
import services.PopServiceImpl;

@WebServlet("/province")
public class Province extends HttpServlet{
	
	private PopService service = new PopServiceImpl();
	
	public Province() {
		System.out.println("Server province creata");	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hai chiamato il metodo Get");
		
		String regione = req.getParameter("regione");
		List<Provincia> provinceByRegione = service.getProvinceByRegione(regione);
		
		req.setAttribute("titolo", regione);
		req.setAttribute("province", provinceByRegione);
		//resp.getWriter().print("Eccho le province della regione: " + regione);
		req.getRequestDispatcher("provinces.jsp").forward(req, resp);
	
	
	}
	
	

}
