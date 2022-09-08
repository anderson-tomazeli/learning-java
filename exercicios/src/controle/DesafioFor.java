package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//versão desafio
		//não pode usar valor numérico para controlar o laço
		
		for (String vlr = "#"; !vlr.equals("#######"); vlr +="#") {
			System.out.println(vlr);
		}
	}
}
