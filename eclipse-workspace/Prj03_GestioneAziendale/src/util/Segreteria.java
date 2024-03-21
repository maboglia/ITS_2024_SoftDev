package util;

public class Segreteria {

	public static String creaId(String nome, String cognome, int annoNascita) {
		
		return nome.substring(0, 3)+ cognome.substring(0, 3)+ annoNascita;

	}

}
