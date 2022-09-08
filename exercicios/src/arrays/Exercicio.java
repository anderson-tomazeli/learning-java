package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		//Exibe valores padrões do double
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println("\nPrimeira nota AlunoA: " + notasAlunoA[0]);
		System.out.println("Última nota AlunoA: " + notasAlunoA[notasAlunoA.length-1]);
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println("\nMédia AlunoA: " + totalAlunoA / notasAlunoA.length);

		final double notaArmazenada = 5.9; //Constante
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}

		System.out.println("Média AlunoB: " + totalAlunoB / notasAlunoB.length);
		
	}
}
