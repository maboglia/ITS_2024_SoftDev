package dipendenti;

public class Impiegato extends Dipendente {

	private int oreLavorate;
	
	public Impiegato(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
		this.ruolo = "Impiegato";
	}

	@Override
	public double calcolaStipendio() {
		// TODO Auto-generated method stub
		return oreLavorate * pagaBase;
	}

	public int getOreLavorate() {
		return oreLavorate;
	}

	public void setOreLavorate(int oreLavorate) {
		this.oreLavorate = oreLavorate;
	}

}
