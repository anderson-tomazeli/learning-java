package classe;

public class PrimeiroTrauma {

	//Acessando atributos dentro da main
	int a = 3;
	static int b = 4; //atributo da classe, pode ser acessado diretamente, sem instanciar objeto
	
	public static void main(String[] args) {
		
		PrimeiroTrauma x1 = new PrimeiroTrauma();
		
		System.out.println(x1.a);
		System.out.println(b);
	}
}
