package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		//linha 15 usada somente entre construtores, 
		//n�o usar isso no outro construtor para evitar loops indevidos
		this(1, 1, 1970); //chamada do construtor que contem os 3 parametros int(linha 16)
	}
	
	Data(int dia, int mes, int ano) {
		//dessa maneira n�o se perde os valores no escopo do construtor/m�todo
		this.dia = dia; //this.dia = atributo da inst�ncia, neste caso, definido na linha 5
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		String formato = "%d/%d/%d";
		return(String.format(formato, dia, mes, ano));
	}
	
	//usando o this para chamada de m�todos
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
	
}
