package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//vers�o desafio
		//n�o pode usar valor num�rico para controlar o la�o
		
		for (String vlr = "#"; !vlr.equals("#######"); vlr +="#") {
			System.out.println(vlr);
		}
	}
}
