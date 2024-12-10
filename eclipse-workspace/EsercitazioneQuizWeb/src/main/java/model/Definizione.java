package model;

public class Definizione {

	private int id;
	private String parola;
	private String traduzione;
	private String fraseEng;
	private String fraseIta;

	/**
	 * Costruttore
	 * @param id
	 * @param parola
	 * @param traduzione
	 * @param fraseEng
	 * @param fraseIta
	 */
	public Definizione(int id, String parola, String traduzione, String fraseEng, String fraseIta) {
		this.id = id;
		this.parola = parola;
		this.traduzione = traduzione;
		this.fraseEng = fraseEng;
		this.fraseIta = fraseIta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public String getTraduzione() {
		return traduzione;
	}

	public void setTraduzione(String traduzione) {
		this.traduzione = traduzione;
	}

	public String getFraseEng() {
		return fraseEng;
	}

	public void setFraseEng(String fraseEng) {
		this.fraseEng = fraseEng;
	}

	public String getFraseIta() {
		return fraseIta;
	}

	public void setFraseIta(String fraseIta) {
		this.fraseIta = fraseIta;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		int cornicetta = this.fraseIta.length()+20;
		sb.append("\n".repeat(5));
		sb.append("*".repeat(cornicetta)+"\n");
		sb.append("* Parola: "+ this.parola +"\n");
		sb.append("* Traduzione: "+ this.traduzione +"\n");
		sb.append("* --- \n");
		sb.append("* Eng: "+ this.fraseEng +"\n");
		sb.append("* Ita: "+ this.fraseIta +"\n");
		sb.append("*".repeat(cornicetta)+"\n");
		
		return sb.toString();
	}
	
	
}
