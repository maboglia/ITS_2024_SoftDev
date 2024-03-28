package demo;

import java.util.ArrayList;

import model.*;

public class ProvaGeometria {

	public static void main(String[] args) {

		System.out.println("Programma Geometria Piana");
		
		Punto a = new Punto(3,2);
		Punto b = new Punto(7,2);
		Punto c = new Punto(3,5);
		
		Segmento ab = new Segmento(a, b);
		Segmento ac = new Segmento(a, c);
		Segmento bc = new Segmento(b, c);

		Figura t = new Triangolo(a, b, c);
		
		Figura r = new Rettangolo(ab, ac);
//		System.out.println(r);
		
		Figura q = new Quadrato(ab);
//		System.out.println(q);
		
		ArrayList<Figura> figure = new ArrayList<>();
		
		figure.add(t);
		figure.add(r);
		figure.add(q);
		
		for (Figura figura : figure) {
			
			if (figura instanceof Quadrato) {
				System.out.println("è un quadrato!!!");
				((Quadrato)figura).area();
			}
			
			System.out.println(figura);
		}
		
		
//triangolo		
//		System.out.println(t);
		
//Segmento		
//		System.out.println(ab);
//		System.out.println(ac);
//		System.out.println(bc);
		
//Punto
//		System.out.println("Il valore di x: "+  a.getX());
//		System.out.println("Il valore di y: "+  a.getY());
//		a.setY(7);
//		System.out.println("Il valore di y: "+  a.getY());
//		System.out.println(a);
//		System.out.println(b);
	}

}
