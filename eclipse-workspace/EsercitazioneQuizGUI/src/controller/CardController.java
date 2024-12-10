package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import model.Definizione;
import util.LeggiScriviFile;

public class CardController {

	private List<Definizione> termini;
	
	public CardController() {
		termini = new ArrayList<>();
		init();
	}
	
	public void init() {
		ArrayList<String> righe = LeggiScriviFile.leggiRighe(new File("files/dict-ita-eng.tsv"));
		this.termini.clear();
		for (String riga : righe) {
			if(!riga.startsWith("Nr.")) {
				String[] split = riga.split("\t");
				int id = Integer.parseInt(split[0]);
				String parola = split[1];
				String traduzione = split[2];
				String fraseEng = split[3];
				String fraseIta = split[4];
				Definizione d = new Definizione(id, parola, traduzione, fraseEng, fraseIta);
				this.termini.add(d);
			}
		}
	}
	
	public String creaRandomCard() {
		Random r = new Random();
		int casuale = r.nextInt(0, termini.size());
		return termini.get(casuale).toString();
	}
	
}
