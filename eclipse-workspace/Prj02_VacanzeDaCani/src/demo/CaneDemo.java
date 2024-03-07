package demo;

import cani.Cane;
import cani.CaneGrande;

public class CaneDemo {

	public static void main(String[] args) {
			
		Cane[] cani = new Cane[10];
		cani[0] = new CaneGrande("boby","pastore bergamasco", 10);
		cani[1] =  new Cane("fuffy","medio","setter", 8);
		cani[2] = new CaneGrande("baby","rottweiler", 5);
		cani[3] =  new Cane("genny","piccolo","setter", 8);
		cani[4] = new CaneGrande("boby","pastore bergamasco", 10);
		cani[5] =  new Cane("fuffy","medio","setter", 8);
		cani[6] = new CaneGrande("boby","pastore bergamasco", 10);
		cani[7] =  new Cane("fuffy","medio","setter", 5);
		cani[8] = new CaneGrande("boby","pastore bergamasco", 10);
		cani[9] =  new Cane("fuffy","medio","setter", 8);
		
//		for(int i = 0; i<cani.length;i++) {
//			cani[i].mangia(i);
//		}
		
		for (Cane cane : cani) {
			
			if (cane instanceof CaneGrande) {
				cane.mangia(1);
			} else {
				if (cane.eta < 8)
					cane.mangia(50);
				else
					cane.mangia(30);
			}
			
			
		}
		

	}

}
