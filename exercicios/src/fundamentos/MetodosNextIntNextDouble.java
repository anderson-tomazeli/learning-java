package fundamentos;

import java.util.Scanner;

public class MetodosNextIntNextDouble {

	public static void main(String[] args) {
	    /*Scanner teclado = new Scanner(System.in);
	     
	    System.out.println("Qual a sua idade?");
	    int idade = teclado.nextInt();
	    
	    System.out.println("Qual o seu nome?");
	    String nome = teclado.nextLine();
	    
	    System.out.println("Qual o seu sobrenome?");
	    String sobrenome = teclado.nextLine();
	     
	    teclado.close();
	    */
		
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Qual a sua idade?");
	    int idade = teclado.nextInt();
	    
	    teclado.nextLine(); //l� o "\\n" que o teclado.nextInt() deixa para tr�s.
	    System.out.println("Qual o seu nome?");
	    
	    String nome = teclado.nextLine();
	    System.out.println("Qual o seu sobrenome?");
	    
	    String sobreNome = teclado.nextLine();
	    System.out.printf("\n\n%s %s tem %d anos ", nome, sobreNome, idade);
	     
	    teclado.close();
	}
	
}
