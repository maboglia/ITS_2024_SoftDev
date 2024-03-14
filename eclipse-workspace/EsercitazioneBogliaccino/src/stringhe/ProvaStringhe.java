package stringhe;

public class ProvaStringhe {

	public static void main(String[] args) {

		String s1 = "ciao";
		String s2 = new String("ciao");
		String s3 = "ciao";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		s1 = "pippo";
		System.out.println(s3);

	}

}
