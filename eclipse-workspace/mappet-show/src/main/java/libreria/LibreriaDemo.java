package libreria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

import model.Libro;

public class LibreriaDemo {

	public static void main(String[] args) throws FileNotFoundException {
		
		List<Libro> listaLibri = new LinkedList<>();
		Set<Libro> setLibri = new HashSet<>();
		Queue<Libro> codaLibro = new LinkedList<>();
		
		Map<Integer, Libro> mappaLibri = new HashMap<>();
		
		Collection<Libro> values = mappaLibri.values();
		Set<Integer> keySet = mappaLibri.keySet();
		
		File f = new File("src/main/resources/files/Biblioteca.csv");
		Scanner input = new Scanner(f);
		
		while (input.hasNextLine()) {

			String riga = input.nextLine();
			
			String[] split = riga.split(",");
			
			String titolo = split[2].trim();
			
			Libro l = new Libro(titolo);
			
			listaLibri.add(l);
			setLibri.add(l);
			codaLibro.add(l);
			
			mappaLibri.put(l.getId(), l);
			
			
			
			System.out.println(titolo);
			
		}
		
		

	}

}
