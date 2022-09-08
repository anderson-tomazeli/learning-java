import java.util.Scanner;

public class Exercicio09ExibeMaiorNumero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//int numero = 0;
		int auxiliar = 0;
		
		for (int x = 1; x <= 10; x++) {
			System.out.print("Entre com um valor #" + x + "/10: ");
			int numero = entrada.nextInt();
			
			if (x == 1) auxiliar = numero;
			else {
				if (numero > auxiliar) {
					auxiliar = numero;
				}
			}
		}
		
		System.out.println("Maior número informado: " + auxiliar);
		entrada.close();
	}
}
