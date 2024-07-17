package com.maboglia.interfacce;

@FunctionalInterface//solo con interfaccia funzionale posso usare le lambda
public interface Contratto {
	//public abstract
	void regola1();
	
	static void mioMetodo() {
		System.out.println("funge");
	}
	
	default void mioMetodo2() {
		
		System.out.println("funge");
	}	
}
