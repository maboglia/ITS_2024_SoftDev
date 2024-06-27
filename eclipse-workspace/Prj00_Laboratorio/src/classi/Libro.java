package classi;

public class Libro {

	private int id;
	private String titolo;
	private Autore autore;
	
	public Libro(String titolo, Autore autore) {
		this.titolo = titolo;
		this.autore = autore;
	}

	public String getTitolo() {
		return titolo.toUpperCase();
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public int getId() {
		return id;
	}
	
	
	
}
