package classe;

public class ValorNulo {

	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("!!!!"));

		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		//se n�o tiver esse tratamento, o erro s� vai ocorrer em tempo de execu��o
		//durante o desenvolvimento, caso n�o tenha o cen�rio criado, pode ser que passe
		//nos testes mas pode dar surpresa quando cair em algum ponto do c�digo que a vari�vel/objeto
		//possa estar null
		if(d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat("????"));
		}
	}
}
