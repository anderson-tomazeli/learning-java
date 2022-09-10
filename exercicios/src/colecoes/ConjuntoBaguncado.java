package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" }) //silencia as advert�ncias
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //double -> Double
		conjunto.add(true); //boolean -> Boolean
		conjunto.add("Teste"); //String
		conjunto.add(1); //int -> Integer
		conjunto.add('x'); //char -> Character
		
		System.out.println("Tamanho �: " + conjunto.size());
		conjunto.add("Teste"); //Como n�o permite duplicidade, o tamanho continua o mesmo
		System.out.println("Tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); //n�o existe e n�o vai remover
		System.out.println(conjunto.remove("Teste")); //existe e vai remover
		System.out.println(conjunto.remove('x')); //existe e vai remover
		
		System.out.println("Tamanho �: " + conjunto.size());
		
		System.out.println(conjunto.contains('x')); //false pq removeu
		System.out.println(conjunto.contains(1)); //true pq existe
		System.out.println(conjunto.contains(true)); //true pq existe

		Set nums = new HashSet(); //vai falar sobre isso no capitulo de OOO
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //Uni�o entre 2 conjuntos
		conjunto.retainAll(nums); //interse��o - valor em comum entre os 2 conjuntos
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}
}
