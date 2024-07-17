package com.maboglia.interfacce;

public class ContrattoImpl implements Contratto {

	@Override
	public void regola1() {
		System.out.println("Ho rispettato la regola n.1");

	}
	
	public void miaRegolaCustom() {
		System.out.println("Fatti miei");
	}

}
