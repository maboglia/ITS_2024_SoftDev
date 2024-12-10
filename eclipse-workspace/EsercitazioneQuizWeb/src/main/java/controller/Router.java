package controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Definizione;
import util.LeggiScriviFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Servlet implementation class Router
 */
@WebServlet("/studia")
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private InputStream is;   
	private List<Definizione> termini;
    
    @Override
	public void init() throws ServletException {
    	System.out.println("INIT--------------------");
		ServletContext context = getServletContext();
		is = context.getResourceAsStream("/files/dict-ita-eng.tsv");
		System.out.println(getServletContext().getRealPath("/"));
		try {
			inizializza();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Router() {
    	termini = new ArrayList<>();
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.setAttribute("definizione", creaRandomCard());
		request.getRequestDispatcher("card.jsp").include(request, response);
		request.setAttribute("definizione", creaRandomCard());
		request.getRequestDispatcher("card.jsp").include(request, response);
		request.setAttribute("definizione", creaRandomCard());
		request.getRequestDispatcher("card.jsp").include(request, response);
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			inizializza();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doGet(request, response);
	}

	public void inizializza() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		ArrayList<String> righe = new ArrayList<String>();
		
		while(br.ready()) {
		     String line = br.readLine();
		     System.out.println(line);
		     righe.add(line);
		}
		this.termini.clear();
		for (String riga : righe) {
			if(!riga.startsWith("Nr.")) {
				String[] split = riga.split("\t");
				int id = Integer.parseInt(split[0]);
				String parola = split[1];
				String traduzione = split[2];
				String fraseEng = split[3];
				String fraseIta = split[4];
				Definizione d = new Definizione(id, parola, traduzione, fraseEng, fraseIta);
				this.termini.add(d);
			}
		}
	}
	public Definizione creaRandomCard() {
		Random r = new Random();
		int casuale = r.nextInt(0, termini.size());
		return termini.get(casuale);
	}
	
}
