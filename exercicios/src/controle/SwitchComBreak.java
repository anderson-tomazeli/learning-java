package controle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String conceito = "";
		
		System.out.print("Informe a nota: ");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9: //Caso seja for 9 OU 10
			conceito = "A";
			break; //Com um break, vai parar nessa condi��o e conclui o switch
		case 8:    //Caso seja 8 ou 7, pode ser definido um embaixo do outro tmb 
		case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default: //o default pode ser usado em qualquer posi��o, inclusive no come�o se quiser
			conceito = "n�o encontrado";
			break;
		}
		
		System.out.println("O conceito � " + conceito);
		entrada.close();
	}
}
