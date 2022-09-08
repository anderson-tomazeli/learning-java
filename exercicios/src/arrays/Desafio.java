package arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		int quantidadeNota = entrada.nextInt();
		
		double[] notas = new double[quantidadeNota];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota #" + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for (double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		
		System.out.println("Média de notas: " + media);
		
		entrada.close();
	}
}
