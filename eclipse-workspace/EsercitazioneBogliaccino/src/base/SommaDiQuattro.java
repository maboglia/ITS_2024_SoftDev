package base;

import java.util.Scanner;

/*
 * Esercizio SommaDiQuattro
Scrivere un programma SommaDiQuattro che chiede all’utente di inserire quattro valori interi, e ne stampa la somma.
 */

public class SommaDiQuattro {

	public static void main(String[] args) {
		
		int somma = 0;
		
		final int CICLI = 4;
		
		for (int i = 0; i<CICLI;i++) {
			somma += chiediNumero();
		}

		System.out.println("La somma dei 4 numeri interi è: " + somma);

	}

	private static int chiediNumero() {
		
		System.out.println("Inserisci un numero intero.");
		Scanner epson = new Scanner(System.in);
		
		return epson.nextInt();
	}

}
