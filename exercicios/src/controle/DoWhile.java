package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// ander Jul 5, 2022
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Tu precisa falar "
					+ "as palavras mágicas...");
			System.out.println("Quer sair? ");
			
			texto = entrada.nextLine();
			
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado");

		entrada.close();
	}
}
