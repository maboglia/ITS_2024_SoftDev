package demo;

import java.util.ArrayList;

import model.Figura;
import model.Punto;
import model.Quadrato;
import model.Rettangolo;
import model.Segmento;

public class Piastrellista {

	public static void main(String[] args) {
		
		ArrayList<Figura> stanze = new ArrayList<Figura>();
		
		Punto p1 = new Punto(0,0);
		Punto p2 = new Punto(5,0);
		Punto p3 = new Punto(7,0);
		
		
		Quadrato cucina = new Quadrato(new Segmento(p1,p2));//25
		Quadrato bagno = new Quadrato(new Segmento(p2,p3));//4
		Rettangolo camera = new Rettangolo(new Segmento(p1,p2), new Segmento(p1,p3));
		Rettangolo camera2 = new Rettangolo(new Segmento(p1,p2), new Segmento(p1,p3));
		
		stanze.add(cucina);
		stanze.add(bagno);
		stanze.add(camera);
		stanze.add(camera2);
		
		double superficieTotale = 0;
		for (Figura stanza : stanze) {
			superficieTotale += stanza.area();
		}
		System.out.println("La superficie dell'appartamento");
		System.out.println(superficieTotale);
		double superficiePiastrella = 0.25;
		double numPiastrelle = superficieTotale / superficiePiastrella;
		System.out.println("Il n.ro di piastrelle: " + numPiastrelle);
		
		
	}
	
}
