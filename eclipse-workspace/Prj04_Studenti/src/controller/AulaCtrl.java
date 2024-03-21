package controller;

import java.util.ArrayList;

import model.Studente;

public class AulaCtrl {

	private ArrayList<Studente> studenti;
	
	public AulaCtrl() {
		this.studenti = new ArrayList<Studente>();
	}
	
	public void addStudente(Studente s) {
		this.studenti.add(s);
	}
	
	public ArrayList<Studente> getStudenti() {
		return studenti;
	}
	
	
	
}
