package classi;

public class ContoCorrente {

	private int nConto;
	private String titolare;
	private double saldo;
	
	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}
	
	public String getTitolare() {
		return titolare;
	}
	
	public void versamento(double amount) {
		if (amount > 0)
		this.saldo += amount;
	}

	public double prelievo(double amount) {
		if (this.saldo >= amount) {
			this.saldo -= amount;
			return amount;
		}
		System.out.println("Disponibilità insufficiente prelievo annullato!");
		return 0;
	}

	@Override
	public String toString() {
		return "ContoCorrente [nConto=" + nConto + ", titolare=" + titolare + ", saldo=" + saldo + "]";
	}
	
	
	
}
