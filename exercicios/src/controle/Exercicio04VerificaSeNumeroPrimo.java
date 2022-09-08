package controle;

import java.util.Scanner;

public class Exercicio04VerificaSeNumeroPrimo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int valor = entrada.nextInt();
		int resultado = 0;
		
		for (int i = 2; i <= valor / 2; i++) {
			if (valor % i == 0) {
				resultado++;
				break;
			}
		}
		
		if (resultado == 0) {
		
			System.out.printf("%d é um número primo", valor);
		
		} else {
		
			System.out.printf("%d NÃO é um número primo", valor);
		
		}
		
		entrada.close();
	}
}
