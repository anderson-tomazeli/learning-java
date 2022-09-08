package arrays;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2); //False: 2 objetos distintos na mem�ria
		System.out.println(u1.equals(u2)); //equals como padr�o � o mesmo que ==
		System.out.println(u2.equals(u1)); //ap�s implementado na classe Usuario, retorna true
		
		System.out.println(u2.equals(new Date())); //d� erro se n�o tratar com instanceof (tipo diferente)
		
	}
}
