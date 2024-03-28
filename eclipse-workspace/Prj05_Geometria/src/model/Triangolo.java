package model;

public class Triangolo extends Figura{
	
	private Punto a, b, c;
	private Segmento ab, ac, bc;
	
	/**
	 * Costruttore del triangolo 
	 * @param a passare in argomento il punto a
	 * @param b passare in argomento il punto b
	 * @param c passare in argomento il punto c
	 */
	public Triangolo(Punto a, Punto b, Punto c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento(a,b);
		this.ac = new Segmento(a,c);
		this.bc = new Segmento(b,c);
		this.nome = "Triangolo";
	}

	public double perimetro() {
		return ab.lunghezza() 
				+ ac.lunghezza() 
				+ bc.lunghezza();
	}
	
	public double area() {
		double sp = perimetro()/2;
		return  Math.sqrt(
				sp *
				(sp - ab.lunghezza()) *
				(sp - ac.lunghezza()) *
				(sp - bc.lunghezza()) 

				
				);
		
	}

	
	
	
}
