package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		System.out.println("Your locale is set to: " + Locale.getDefault());
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o salario #1: ");	
		String salarioUm = entrada.nextLine().replace(",", ".");
		
		System.out.println("\nDigite o salario #2: ");	
		String salarioDois = entrada.nextLine().replace(",", ".");
		
		System.out.println("\nDigite o salario #3: ");	
		String salarioTres = entrada.nextLine().replace(",", ".");
		
		entrada.close();
		
		double salario1 = Double.parseDouble(salarioUm); 
		double salario2 = Double.parseDouble(salarioDois); 
		double salario3 = Double.parseDouble(salarioTres); 
		
		double soma = salario1 + salario2 + salario3; 

		System.out.println("Sua média salarial é de: " + soma/3);
		
	}
}
