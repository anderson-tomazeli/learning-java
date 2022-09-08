package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		// informar notas validas de 0-10 soma em uma variavel chamada total
		// criar outra variavel para contar quantas notas foram validas
		// se informar nota inválida pede pra digitar uma nota valida "informe uma nota valida por favor"
		// no final mostra a média
		// sai quando o usuário digitar -1
		
		// ander Jul 5, 2022
		Scanner entrada = new Scanner(System.in);

		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			
			System.out.print("Informe a nota ou -1 para sair:");
			nota = entrada.nextFloat();


			if ((nota <= 10) && (nota >= 0)){
				total+=nota;
				quantidadeNotas++;
			} else if (nota != -1){
				System.out.println("Nota inválida");
			}

		}

		double media = total / quantidadeNotas;
		System.out.println("A média é " + media);
		//System.out.printf("A média de notas é %.2f / %d: %.2f", total, conta, total/conta);
		entrada.close();
	}

}