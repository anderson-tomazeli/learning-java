package desafio;

public class Jantar {

	public static void main(String[] args) {
				
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijão", 0.457);
		Comida c3 = new Comida("Maionese", 0.32);
		
		Pessoa p = new Pessoa("Anderson", 99.3);
		
		//System.out.println("Nome: " + p.nome + "\nPeso Antes: " + p.peso);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
		p.comer(c3);
		System.out.println(p.apresentar());
		
		System.out.printf("Peso Total após o jantar: %.2f", p.peso);
		
	}
}
