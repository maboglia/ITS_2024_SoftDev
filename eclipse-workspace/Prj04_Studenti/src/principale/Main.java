package principale;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import model.Studente;

public class Main {

	public static void main(String[] args) {


		File f = new File("files/studenti.txt");
		File destinazione = new File("W:\\SWD_23-25\\comune\\studenti.html");
		
		try {
			Scanner input = new Scanner(f);
			PrintWriter pennarello = new PrintWriter(destinazione);
			
			pennarello.println("<h1>Studenti</h1>");
			
			pennarello.println("<ul>");
			
			while(input.hasNextLine()) {
				String riga = input.nextLine();
				
				String[] parole = riga.split(",");
				
				String nome = parole[0];
				String cognome = parole[1];
				
				Studente s = new Studente(nome, cognome);
				pennarello.println("<li>" +  s.getCognome() + "</li>");
				//System.out.println(s);
			}
			pennarello.println("</ul>");
			pennarello.close();
			
		} catch (FileNotFoundException e) {
			
			System.err.println("Mi dispiace il file non è raggiugnibile");
			System.err.println(e.getMessage());
		}
		
		System.out.println("Programma terminato");

	}

}
