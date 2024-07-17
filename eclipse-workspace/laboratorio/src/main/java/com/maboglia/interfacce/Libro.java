package com.maboglia.interfacce;

public class Libro implements Comparable<Libro>  {

	public String titolo;
	public int pagine;
	
	@Override
	public int compareTo(Libro altroLibro) {
		// TODO Auto-generated method stub
		return this.pagine - altroLibro.pagine;
	}

	public Libro(String titolo) {
		super();
		this.titolo = titolo;
	}
	
}
