package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import model.Libro;

public class LibroCtrl extends Object {

	private List<Libro> libri;

	public LibroCtrl() {
		this.libri = new ArrayList<>();
	}
	
	public void addLibro(Libro l) {
		this.libri.add(l);
	}
	
	public List<Libro> getLibri(){
		return this.libri;
	}
	
	
}
