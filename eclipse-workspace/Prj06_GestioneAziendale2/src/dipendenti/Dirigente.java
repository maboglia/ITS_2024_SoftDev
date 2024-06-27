package dipendenti;

public class Dirigente extends Dipendente {

	private int dipendentiAssegnati;
	
	public Dirigente(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
		this.ruolo = "Dirigente";
	}

	@Override
	public double calcolaStipendio() {
		// TODO Auto-generated method stub
		return dipendentiAssegnati * pagaBase * 10;
	}

	public int getDipendentiAssegnati() {
		return dipendentiAssegnati;
	}

	public void setDipendentiAssegnati(int dipendentiAssegnati) {
		this.dipendentiAssegnati = dipendentiAssegnati;
	}

}
