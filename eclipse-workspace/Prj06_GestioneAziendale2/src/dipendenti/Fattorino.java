package dipendenti;

public class Fattorino extends Dipendente {

	private int numConsegne;
	
	public Fattorino(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
		this.ruolo = "Fattorino";
	}

	@Override
	public double calcolaStipendio() {
		// TODO Auto-generated method stub
		return numConsegne * pagaBase;
	}

	public int getNumConsegne() {
		return numConsegne;
	}

	public void setNumConsegne(int numConsegne) {
		this.numConsegne = numConsegne;
	}

}
