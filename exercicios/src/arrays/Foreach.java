package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		//Using the normal for
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		//Percorre todos os elementos e armazena na variavel nota a cada interação do for
		for(double nota: notas) {
			System.out.print(nota + " ");
		}
	}
}
