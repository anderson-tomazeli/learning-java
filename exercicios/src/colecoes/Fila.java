package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> add elementos na fila
		//Diferença é o comportamento que ocorre
		//qdo a fila está cheia
		fila.add("Ana"); //retorna false qdo a fila está cheia
		fila.offer("Bia"); //lança uma exceção qdo a fila está cheia
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obtem o proximo elemento da fila (sem remover)
		//qdo a fila está vazia
		System.out.println(fila.peek()); //retorna false se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lanca uma excecao se a fila estiver vazia
		System.out.println(fila.element());
		

		//Poll e Remove -> obtem o proximo elemento da fila (remover)
		//diferença é qdo a fila está vazia poll retorna null
		//remove lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 

		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
	}
}
