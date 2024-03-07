package giochi;

public class Dado {

	int facce = 6; 
	int facciaUscita =1;
	
	public void lancia() {
		
		facciaUscita =  (int)(Math.random() * facce) + 1 ; //0.0 -- 0.99999999999
		
		//facciaUscita = 4;
	} 
	
}
