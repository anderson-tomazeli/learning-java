package desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if (comida != null) { //Recebeu uma comida válida. Se for inválido, nem faz nada aqui
			System.out.println("Adicionando " + comida.nome + " peso: " + comida.peso);
			this.peso += comida.peso;	
		}
	}
	
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + "Kgs.";
	}
	
}
