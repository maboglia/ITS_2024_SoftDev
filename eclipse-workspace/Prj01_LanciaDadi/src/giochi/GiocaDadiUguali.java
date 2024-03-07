package giochi;

public class GiocaDadiUguali {

	public static void main(String[] args) {

		Dado dado1 = new Dado();// metodo costruttore
		Dado dado2 = new Dado();// metodo costruttore

		final int NUM_LANCI = 1_000_000_000;
		int vittorie = 0;

		long start = System.currentTimeMillis();
		for (int i = 0; i < NUM_LANCI; i++) {
			dado1.lancia();
			dado2.lancia();

			if (dado1.facciaUscita == dado2.facciaUscita) {
				//System.out.println("hai vinto");
				vittorie++;
			} else {
				// System.out.println("non hai vinto");
			}

		}
		long stop = System.currentTimeMillis();

		System.out.printf("Hai giocato %d volte %n", NUM_LANCI);
		System.out.println("Hai vinto " + vittorie + " volte");
		double percentuale = (double) vittorie / NUM_LANCI * 100 ;
		System.out.println(percentuale);
		System.out.println("Il tempo impiegato dall'elaborazione è: ");
		System.out.println(stop - start + "ms");

	}

}
