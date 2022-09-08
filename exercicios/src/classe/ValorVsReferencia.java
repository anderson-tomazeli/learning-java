package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		double a =2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b); //atribui��o por valor (Tipo primitivo) - os valores s�o independentes
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //atribui��o por refer�ncia (Objeto) - o mesmo objeto em mem�ria
		
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
	
	static void voltarDataParaValorPadrao(Data d) { //Passando um objeto como refer�ncia tamb�m ir� impactar 
													//em todos os valores deste objeto, conforme linhas 27 e 28
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) { //como � valor primitivo, vai passar uma c�pia e seu conte�do n�o � alterado como os objetos
		a++;
	}
}
