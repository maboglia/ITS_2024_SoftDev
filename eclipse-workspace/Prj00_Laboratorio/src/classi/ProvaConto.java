package classi;

public class ProvaConto {

	public static void main(String[] args) {
		ContoCorrente cc = new ContoCorrente();
		cc.versamento(-500);
		cc.prelievo(250);
		cc.prelievo(251);
		
		System.out.println(cc);
		
	}

}
