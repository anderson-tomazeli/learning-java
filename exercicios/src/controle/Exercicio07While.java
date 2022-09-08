package controle;

import java.util.Scanner;

public class Exercicio07While {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
		int soma = 0;
		
		do {
			System.out.print("Digite o valor: ");
			valor = entrada.nextInt();
			
			if (valor > 0) {
				soma += valor;
				System.out.println("Valor somado: " + soma);
			}
		} while (valor > 0);
		
		entrada.close();
	}
}
