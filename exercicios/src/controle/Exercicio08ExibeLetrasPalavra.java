package controle;

import java.util.Scanner;

public class Exercicio08ExibeLetrasPalavra {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = "";
		
		System.out.print("Informe uma palavra: ");
		palavra = entrada.next();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println("Letra #" + (i+1) + " : " + palavra.charAt(i));
		}
		
		entrada.close();
	}
}
