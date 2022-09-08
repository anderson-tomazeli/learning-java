package desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if (comida != null) { //Recebeu uma comida v�lida. Se for inv�lido, nem faz nada aqui
			System.out.println("Adicionando " + comida.nome + " peso: " + comida.peso);
			this.peso += comida.peso;	
		}
	}
	
	String apresentar() {
		return "Ol� eu sou o " + nome + " e tenho " + peso + "Kgs.";
	}
	
}
