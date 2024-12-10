package main;

import java.util.Scanner;

import controller.CardController;

public class DemoCard {
	public static void main(String[] args) {
		boolean gira = true;
		Scanner input = new Scanner(System.in);
		CardController ctrl = new CardController();
		while(gira) {
			System.out.println(ctrl.creaRandomCard());
			//System.out.println("Premi 1 + invio per giocare");
			System.out.println("0 + invio per uscire");
			if (input.nextLine().equals("0"))
				gira = false;
			
		}
		
		System.out.println("\n".repeat(5) + "GAME OVER" + "\n".repeat(5)  );
		
	}
}
