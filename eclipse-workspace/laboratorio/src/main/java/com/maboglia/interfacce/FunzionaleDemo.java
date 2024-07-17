package com.maboglia.interfacce;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Filtratore implements Predicate<String>{

	@Override
	public boolean test(String t) {
		// TODO Auto-generated method stub
		return t.endsWith("a");
	}
	
}

public class FunzionaleDemo {

	public static void main(String[] args) throws IOException {
		
		Stream<String> of = Stream.of("do", "re", "mi", "fa", "sol", "la", "si", "la");
	
		Predicate<String> f = new Predicate() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.endsWith("a");
			}
		};
		
		
		of
			.filter(f)
			
			.forEach(n -> System.out.println(n));
		
		IntStream voti = IntStream.of(24,25,26,28,18,15,19,25,28,30,30,16);
		
		IntSummaryStatistics summaryStatistics = voti.summaryStatistics();
		
		List<String> allLines = Files.readAllLines(Paths.get("W:\\SWD_23-25\\comune\\magazzino.txt"));
		
		allLines.stream().forEach(Libro::new);//(riga -> System.out.println(riga))
		
		
		//System.out.println(summaryStatistics);
		
		
	}
	
	
	
}
