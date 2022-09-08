package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		// Domingo -> 1
		// Quarta  -> 4
		// Terça   -> 3
		//Cria um scanner e o programa tem que retornar o nro do dia da semana com if else if
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		
		String diaSemana = entrada.next();
		
		int numDiaSemana;
		
		if ("Domingo".equalsIgnoreCase(diaSemana)) { /* Just a different way to compare the strings*/
			numDiaSemana = 1;
		} else if (diaSemana.equalsIgnoreCase("Segunda")){
			numDiaSemana = 2;
		} else if (diaSemana.equalsIgnoreCase("Terça") || diaSemana.equalsIgnoreCase("Terca")) {
			numDiaSemana = 3;
		} else if (diaSemana.equalsIgnoreCase("Quarta")) {
			numDiaSemana = 4;
		} else if (diaSemana.equalsIgnoreCase("Quinta")) {
			numDiaSemana = 5;
		} else if (diaSemana.equalsIgnoreCase("Sexta")) {
			numDiaSemana = 6;
		} else if (diaSemana.equalsIgnoreCase("Sábado") || diaSemana.equalsIgnoreCase("sabado")){
			numDiaSemana = 7;
		} else {
			numDiaSemana = 0;
		}
		entrada.close();
		
		System.out.printf("O dia %s equivale a %d", diaSemana, numDiaSemana);
		
	}
}
