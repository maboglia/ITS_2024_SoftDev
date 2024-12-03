package main;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import controller.LibroCtrl;
import model.Libro;

//class ComparatorePrezzo implements Comparator<Libro>{
//
//	@Override
//	public int compare(Libro libro1, Libro libro2) {
//		
//		return Double.compare(libro2.getPrezzo(), libro1.getPrezzo());
//	}
//	
//}


public class DemoLibri {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://raw.githubusercontent.com/maboglia/ProgrammingResources/refs/heads/master/tabelle/libri/Biblioteca.csv");
		
		URLConnection flusso = url.openConnection();
		LibroCtrl ctrl = new LibroCtrl();
		Random rand = new Random();
		
		Scanner sc = new Scanner(new InputStreamReader(flusso.getInputStream()));
		
		while(sc.hasNextLine()) {
			String riga = sc.nextLine();
			String[] split = riga.split(",");
			String titolo = split[2];
			Libro temp = new Libro();
			temp.setTitolo(titolo);
			temp.setPagine(rand.nextInt(50,100));
			temp.setPrezzo(rand.nextDouble(5, 15));
			ctrl.addLibro(temp);
		}
		
		
//		Libro l1 = new Libro(1, "Zorro", 10, 100); 
//		Libro l2 = new Libro(2, "Anna coi capelli", 15, 50); 
//		Libro l3 = new Libro(3, "Marcovaldo", 5, 150); 
		
		
		
//		ctrl.addLibro(l1);
//		ctrl.addLibro(l2);
//		ctrl.addLibro(l3);

//		for (int i = 0; i < ctrl.getLibri().size(); i++) {
//			System.out.println(ctrl.getLibri().get(i));
//		}
		
//		for (Libro l : ctrl.getLibri()) {
//			System.out.println(l);
//		}
		
		Comparator<Libro> cp = (libro1, libro2) -> Double.compare(libro2.getPrezzo(), libro1.getPrezzo());
		
		
		//Collections.sort(ctrl.getLibri(), cp);
		
		List<String> listatitolo = ctrl
			.getLibri()
			.stream()
			.filter(l -> l.getPrezzo() > 9)
			//.sorted((libro1, libro2) -> Double.compare(libro2.getPrezzo(), libro1.getPrezzo()))
			.sorted()
			.map(l -> l.getTitolo())
			.toList();
		
		PrintWriter printer = new PrintWriter(
				new File("W:\\SWD_23-25\\comune\\samu.txt")
				);
		listatitolo.forEach(printer::println);
		
		IntStream voti = IntStream.of(24,25,26,28,18,15,19,25,28,30,30,16);
		
		IntSummaryStatistics summaryStatistics = voti.summaryStatistics();
		
		System.out.println(summaryStatistics);
	
	}

}
