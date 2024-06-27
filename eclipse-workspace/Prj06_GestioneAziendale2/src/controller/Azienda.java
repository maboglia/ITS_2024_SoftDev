package controller;

import java.util.ArrayList;

import dipendenti.*;

public class Azienda {

	private String nome;
	private ArrayList<Dipendente> dipendenti;

	public Azienda(String nome) {
		this.dipendenti = new ArrayList<>();
		this.nome = nome;
	}
	
	public void addDipendente(String nome, String cognome, String ruolo) {
		
		switch (ruolo) {
			case "I":
				Impiegato d = new Impiegato(nome, cognome);
				d.setOreLavorate(100);
				this.dipendenti.add(d);
			break;
			case "F":
				Fattorino f = new Fattorino(nome, cognome);
				f.setNumConsegne(200);
				this.dipendenti.add(f);
			break;
			case "D":
				Dirigente d1 = new Dirigente(nome, cognome);
				d1.setDipendentiAssegnati(15);
				this.dipendenti.add(d1);
			break;
		default:
			break;
		}
		
	}
	
	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}
	
	public ArrayList<Fattorino> getFattorini() {
		ArrayList<Fattorino> fattorini = new ArrayList<>();
		for (Dipendente d : dipendenti) {
			if (d instanceof Fattorino) 
				fattorini.add((Fattorino) d);
		}
		
		return fattorini;
	}
	
	
}
