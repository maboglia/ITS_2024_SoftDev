package model;

public class Quadrato extends Rettangolo {//is-a

	private Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
		this.nome = "Quadrato";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(this.lato.lunghezza(), 2) ;
	}

	
	
}
