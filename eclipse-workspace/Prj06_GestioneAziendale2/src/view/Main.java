package view;

import java.util.ArrayList;

import controller.Azienda;
import dipendenti.Dipendente;

public class Main {

	public static void main(String[] args) {

		Azienda a1 = new Azienda("swd");
		
		a1.addDipendente("alessandro", "aliberti", "F");
		a1.addDipendente("edoardo", "berardengo", "F");
		a1.addDipendente("maria", "doro", "I");
		a1.addDipendente("fabio", "melani", "D");
		
		ArrayList<Dipendente> dipendenti = a1.getDipendenti();
		
		for (Dipendente dipendente : dipendenti) {
			System.out.println(dipendente);
		}
		
		
	}

}
