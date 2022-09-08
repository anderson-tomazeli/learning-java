package controle;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;

		do {
			
			System.out.print("Entre com um valor [-1 para sair]");
			valor = entrada.nextInt();

			String mensagem = "O n�mero " + valor + " ";
			
			if (valor % 2 == 0) {
				mensagem += "� par ";
			} else {
				mensagem += "n�o � par ";
			}
				
			if (valor >=0 && valor <= 10){
				mensagem += "e est� entre 1 e 10";
			} else { //if (valor <=0 || valor >= 10){
				mensagem += "e n�o est� entre 1 e 10";
			}
			
			System.out.println(mensagem);
			
		} while (valor != -1);
		
		System.out.println("Thanks!");
				
		entrada.close();
	}
}
