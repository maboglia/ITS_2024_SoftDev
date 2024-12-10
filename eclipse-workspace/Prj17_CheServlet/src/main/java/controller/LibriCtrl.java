package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;
import services.Libreria;

import java.io.IOException;
import java.nio.file.Files;

import org.json.JSONArray;

/**
 * Servlet implementation class LibriCtrl
 */
@WebServlet("/libri")
public class LibriCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LibriCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		JSONArray collezione = new JSONArray(Libreria.getLibri());
		
		response.setContentType("application/json");
		
		response
			.getWriter()
			.append(collezione.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("titolo") != null) {
			String titolo = request.getParameter("titolo");
			String autore = request.getParameter("autore");
			int id = Integer.parseInt(request.getParameter("id"));
			double prezzo = Double.parseDouble(request.getParameter("prezzo"));
			Libro l = new Libro();
			l.setTitolo(titolo);
			l.setAutore(autore);
			l.setId(id);
			l.setPrezzo(prezzo);
			Libreria.addLibro(l);
			
		}
		response.sendRedirect("index.jsp");
		//doGet(request, response);
	}

}
