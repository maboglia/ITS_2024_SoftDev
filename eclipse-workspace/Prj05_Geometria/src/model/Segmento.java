package model;

public class Segmento {

	private Punto a, b;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	public double lunghezza() {
		
		
		return Math.sqrt(
				Math.pow(a.getX() - b.getX(), 2)
				+
				Math.pow(a.getY() - b.getY(), 2)

				);
		
		
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza()=" + lunghezza() + "]";
	}

	
	
	
	
}
