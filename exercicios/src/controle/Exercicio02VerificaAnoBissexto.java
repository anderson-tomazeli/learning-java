package controle;

import java.util.Scanner;

public class Exercicio02VerificaAnoBissexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int ano = 0;
		boolean anoBissexto = false;

		while (ano != -1) {

			System.out.print("Informe um ano [-1 para sair]:\n");
			ano = entrada.nextInt();
			
			anoBissexto = false;
			
			if (ano % 4 == 0) {
				if (ano % 100 == 0) {
					if (ano % 400 == 0) {
						anoBissexto = true;						
					} else {
						anoBissexto = false;
					}
					
				} else {
					anoBissexto = true;
				}
			} else {
				anoBissexto = false;
			}
			
			if (ano != -1) {
				if (anoBissexto) {
					System.out.printf("O ano %d é bissexto\n", ano);
				} else {
					System.out.printf("O ano %d não é bissexto\n", ano);
				}				
			}
		}
		
		entrada.close();
		
		System.out.println("Fim");
	}
}
