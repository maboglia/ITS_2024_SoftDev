package com.maboglia.interfacce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//class ComparatoreTitoloLibri implements Comparator<Libro>{
//
//	@Override
//	public int compare(Libro libro1, Libro libro2) {
//		// TODO Auto-generated method stub
//		return libro2.titolo.compareTo(libro1.titolo);
//	}
//	
//}

public class InterfacceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ProvaZero pz = new ProvaZero();
//		ZeroMethod pz2 = new ProvaZero();
		
		//Contratto cc = () -> System.out.println("pippo");
		
		Libro l1 = new Libro();
		l1.titolo = "io robot";
		l1.pagine = 123;
		
		Libro l2 = new Libro();
		l2.titolo = "zanna bianca";
		l2.pagine = 23;
		
		Libro l3 = new Libro();
		l3.titolo = "baciami piccina";
		l3.pagine = 75;
		
		List<Libro> libri = new ArrayList<>(List.of(l1, l2,l3));

//		Comparator<Libro> ctl = new Comparator<>() {
//			
//			@Override
//			public int compare(Libro libro1, Libro libro2) {
//				// TODO Auto-generated method stub
//				return libro1.titolo.compareTo(libro2.titolo);
//			}
//		};
//		
		
		//Collections.sort(libri,(libro1, libro2) -> libro1.titolo.compareTo(libro2.titolo));
		
		libri
			.stream()
			.filter(l -> l.pagine > 50)
			.sorted( (ll1, ll2) -> ll1.titolo.compareTo(ll2.titolo))
			.forEach(l -> System.out.println(l.titolo));
		System.out.println("----------------------");
		
		
		List<Libro> libriFiltrati = libri
		.stream()
//		.filter(l -> l.pagine < 50)
		.filter(l -> l.titolo.toUpperCase().startsWith("Z"))
		.sorted( (ll1, ll2) -> ll2.titolo.compareTo(ll1.titolo))
		.limit(3)
		//.forEach(l -> System.out.println(l.titolo));
		.collect(Collectors.toList());
	
		
		
		
	}

}
