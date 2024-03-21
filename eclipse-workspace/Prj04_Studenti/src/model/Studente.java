package model;

public class Studente {
	
	//proprietà della classe Studente
	private static int counter = 1;
	
	//attributi degli oggetti
	private int id;
	private String nome;
	private String cognome;
	
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.id = Studente.counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Studente.counter = counter;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + "]";
	}


	
	
	
	
	

}
