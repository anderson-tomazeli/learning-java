package controle;

import java.util.Scanner;

public class Exercicio06Adivinha {

	public static void main(String[] args) {
		int min = 0;
		int max = 100;
		
		int valor = (int)(Math.random()*(max-min+1)+min);
		int numero = 0;
		int count;
		System.out.println("valor " + valor);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Adivinha o numero");
		for (count = 1; count <= 10; count++) {
			System.out.print("Tentativa #" + count + ": ");
			numero = entrada.nextInt();
			
			String maior_menor = "";
			if (numero == valor) {
				break;
			} else {
				if (numero > valor) {
					maior_menor = "maior";
				} else if (numero < valor){
					maior_menor = "menor";
				}
				
				System.out.println("O valor que vc digitou é " + maior_menor);
			}
			
			
			System.out.println("Restam " + (10 - count) + " tentativas");
		}
		
		if (numero == valor) {
			System.out.println("Tu acertou na tentativa #" + count);
		} else {
			System.out.println("Tu erro todas as vezes, o número era: " + valor);
		}
		
		entrada.close();
	}
}
