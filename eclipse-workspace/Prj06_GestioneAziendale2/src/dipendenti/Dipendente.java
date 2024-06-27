package dipendenti;

public abstract class Dipendente {//new Dipendente()

	private static int matricolatore = 1;
	
	private int nMatricola;
	private String nome;
	private String cognome;
	protected String ruolo;
	protected double pagaBase;
	
	public Dipendente(String nome, String cognome) {
		this.nMatricola = matricolatore++;
		this.nome = nome;
		this.cognome = cognome;
		this.pagaBase = 9;
	}
	
	public abstract double calcolaStipendio();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dipendente [nMatricola=");
		builder.append(nMatricola);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", ruolo=");
		builder.append(ruolo);
		builder.append(", calcolaStipendio()=");
		builder.append(calcolaStipendio());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
