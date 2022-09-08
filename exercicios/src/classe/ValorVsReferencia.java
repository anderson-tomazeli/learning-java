package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		double a =2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b); //atribuição por valor (Tipo primitivo) - os valores são independentes
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //atribuição por referência (Objeto) - o mesmo objeto em memória
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		//Traz o mesmo valor para ambas as linhas abaixo (o que fizer em d1 vai impactar em d2 e vice-versa)
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d2);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao(Data d) { //Passando um objeto como referência também irá impactar 
													//em todos os valores deste objeto, conforme linhas 27 e 28
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) { //como é valor primitivo, vai passar uma cópia e seu conteúdo não é alterado como os objetos
		a++;
	}
}
