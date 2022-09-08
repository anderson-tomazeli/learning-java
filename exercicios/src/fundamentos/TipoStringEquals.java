package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // ao usar vari�veis do tipo String, sempre use o m�todo .equals() para checar conte�dos
		
		Scanner entrada = new Scanner(System.in);
		
		//String s2 = entrada.next();  //remove espa�os em brancos
		String s2 = entrada.nextLine();  //n�o remove espa�os em brancos
		//System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2));
		System.out.println("2".equals(s2.trim())); // trim remove espa�os antes e depois, caso exista
		entrada.close();
	}
}

