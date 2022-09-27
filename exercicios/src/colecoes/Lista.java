package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Anderson");
		lista.add(u1);
		
		lista.add(new Usuario("Zequinha"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3));
		
		System.out.println(">>>>> " + lista.remove(1)); //retorna o objeto que est� na posi��o informada 
		System.out.println(lista.remove(new Usuario("Manu"))); //remove gra�as ao equals contido na classe Usuario
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia"))); //compara atrav�s do equals/hashcode
		System.out.println("Tem? " + lista.contains(u1)); //compara a partir de endere�o da mem�ria
		
		for(Usuario u: lista) {
			System.out.println(u); //implicitamente est� chamando o m�todo toString da classe Usu�rio
		}
		
	}
}
