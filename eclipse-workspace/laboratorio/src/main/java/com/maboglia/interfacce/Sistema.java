package com.maboglia.interfacce;

import java.util.Properties;

public class Sistema {

	public static void main(String[] args) {
		Properties properties = System.getProperties();
		properties.setProperty("pacentix.java.top", "not true");
		properties.list(System.out);
		
		
	}

}
