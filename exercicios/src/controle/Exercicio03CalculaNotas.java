package controle;

import java.util.Scanner;

public class Exercicio03CalculaNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a nota #1: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("Informe a nota #2: ");
		float nota2 = entrada.nextFloat();
		
		if (nota1 != 0 && nota2 != 0) {
			
			float media_final = (nota1 + nota2) / 2;
			if (media_final >= 7) {
				System.out.printf("Sua média é %.2f: Aprovado", media_final);
			} else if (media_final < 7 && media_final > 4){
				System.out.printf("Sua média é de %.2f: Em recuperação", media_final);
			} else if (media_final <=4) {
				System.out.printf("Sua média é %.2f: Reprovado", media_final);
			}
		} else {
			System.out.println("Notas devem ser diferentes de 0");
		}
		
		entrada.close();
	}
}
