package model;

public abstract class Figura {//non si possono più istanziare obj

	protected String nome;
	
	public abstract double perimetro();
	public abstract double area();
	@Override
	public String toString() {
		return "Figura [nome=" + nome + ", perimetro()=" + perimetro() + ", area()=" + area() + "]";
	}
	
	
	
}
