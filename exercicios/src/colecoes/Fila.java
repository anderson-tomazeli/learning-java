package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> add elementos na fila
		//Diferen�a � o comportamento que ocorre
		//qdo a fila est� cheia
		fila.add("Ana"); //retorna false qdo a fila est� cheia
		fila.offer("Bia"); //lan�a uma exce��o qdo a fila est� cheia
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element -> obtem o proximo elemento da fila (sem remover)
		//qdo a fila est� vazia
		System.out.println(fila.peek()); //retorna false se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lanca uma excecao se a fila estiver vazia
		System.out.println(fila.element());
		

		//Poll e Remove -> obtem o proximo elemento da fila (remover)
		//diferen�a � qdo a fila est� vazia poll retorna null
		//remove lan�a uma exce��o
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
