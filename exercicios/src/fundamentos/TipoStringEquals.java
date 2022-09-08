package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // ao usar variáveis do tipo String, sempre use o método .equals() para checar conteúdos
		
		Scanner entrada = new Scanner(System.in);
		
		//String s2 = entrada.next();  //remove espaços em brancos
		String s2 = entrada.nextLine();  //não remove espaços em brancos
		//System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2));
		System.out.println("2".equals(s2.trim())); // trim remove espaços antes e depois, caso exista
		entrada.close();
	}
}

