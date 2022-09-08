package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("Bom ");
		System.out.println("dia!");
		
		System.out.printf("Números da Mega Sena: %d %d %d %d %d %d \n %n", 10, 32, 2, 18, 27, 13); // %n tambem quebra a linha, assim como \n
		System.out.printf("Salário: %.1f \n", 1234.76);

		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");	
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");	
		String sobreNome = entrada.nextLine();
		
		System.out.println("Digite a sua idade: ");	
		int idade = entrada.nextInt();
		
		System.out.printf("\n\n%s %s tem %d anos ", nome, sobreNome, idade);
		
		entrada.close();
	}
}
