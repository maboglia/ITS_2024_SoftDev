package services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import model.Libro;

public class Libreria {

	private static List<Libro> libri = new LinkedList();
	
	private static void init() {
		List<String> titoli = Arrays.asList("Io robot", "Tu robot", "Egli robot");
		int counter = 1;
		Random r = new Random();
		for (String titolo : titoli) {
			Libro l = new Libro();
			l.setTitolo(titolo);
			l.setId(counter++);
			l.setAutore("Biasimov");
			l.setPrezzo(r.nextDouble(10, 15));
			libri.add(l);
		}
	
	}
	
	public static Libro addLibro(Libro l) {
		libri.add(l);
		return libri.getLast();
	} 
	
	public static List<Libro> getLibri(){
		if (libri.isEmpty())
			init();
		
		return libri;
	}
	
	
}
