package base;

public class TavolaPitagorica {

	public static void main(String[] args) {

		final int RIGHE = 10;
		final int COLONNE = 10;
		
		for (int i = 1; i <= RIGHE; i++) {
			
			for (int j = 1; j <= COLONNE; j++) {
//				if (i * j % 2 == 0)
				System.out.print(i * j + "\t");
			}
			
			System.out.println();
		}
		

	}

}
