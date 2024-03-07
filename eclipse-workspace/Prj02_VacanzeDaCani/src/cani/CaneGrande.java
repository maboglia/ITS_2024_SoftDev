package cani;

public class CaneGrande extends Cane {

	public String ciboSpeciale;
	
	public CaneGrande(String nome, String razza, int eta) {
		super(nome, "grande", razza, eta);
		// TODO Auto-generated constructor stub
		this.ciboSpeciale = "Scatolette giganti";
	}

	@Override
	public void mangia(int num) {
		// TODO Auto-generated method stub
		super.mangia(num);
	}

	
}
