package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);
		
		media = 5.6;
		resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);

		double nota = 9.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("\nTem desconto? " + temDesconto);
		//System.out.println("Tem desconto? " + resultado);
		System.out.printf("Tem desconto? %s", resultado);
		
	}
}
