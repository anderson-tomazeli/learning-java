package classe;

public class DataTeste {
	
	public static void main(String[] args) {

		Data data1 = new Data();
		
		var data2 = new Data(3, 7, 1984);

		//System.out.printf("A primeira data informada é %d/%d/%d", data1.dia, data1.mes, data1.ano);
		//System.out.printf("\nA segunda data informada é %d/%d/%d", data2.dia, data2.mes, data2.ano);

		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());
	}

}
