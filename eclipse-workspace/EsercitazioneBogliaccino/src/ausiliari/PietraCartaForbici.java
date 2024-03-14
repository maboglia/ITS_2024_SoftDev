package ausiliari;

import java.util.Scanner;

public class PietraCartaForbici {

	public static void main(String[] args) {
		
		System.out.println(menu());
		String sceltaUmano = chiediUmano();
		String sceltaPC = chiediPC();
		
		System.out.println("Umano: " + sceltaUmano);
		System.out.println("PC: " + sceltaPC);
		
		String result = valuta(sceltaUmano, sceltaPC);
	
		System.out.println("Il risultato è: " + result);
	}

	
	
	private static String valuta(String sceltaUmano, String sceltaPC) {
		String result = null;
		
		if (sceltaUmano.equalsIgnoreCase(sceltaPC) )
			result = "PAREGGIO";
		else {
			switch (sceltaUmano.toUpperCase()) {
			case "P":
					if (sceltaPC.equalsIgnoreCase("F"))
						result = "UMANO";
					else 
						result = "PC";
				break;
			case "F":
				if (sceltaPC.equalsIgnoreCase("C"))
					result = "UMANO";
				else 
					result = "PC";
			break;

			case "C":
				if (sceltaPC.equalsIgnoreCase("P"))
					result = "UMANO";
				else 
					result = "PC";
			break;


			default:
				result = "Qualcuno non è stato corretto! La macchina è sempre corretta...";
				break;
			}
		}
		

		return result;
	}



	private static String chiediPC() {
		String scelta = "P";
		
		double casuale = Math.random();//0.0 < 1.0
		
		if (casuale < 0.33)
			scelta = "C";
		else if (casuale < 0.66)
			scelta = "F";
		
		return scelta;
	}



	private static String chiediUmano() {
		System.out.println("Scrivi una sola lettera, l'iniziale");
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}



	private static String menu() {//static = appartiene alla classe
		
		return "Scegli tra \n P) pietra \n F) Forbici \n C) Carta";
	}

	
	
	

}
