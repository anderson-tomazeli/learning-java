package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b;
		c -= a; //c = c - a;
		c *= b; //c = c * b;
		c /= a; //c = c / b;
		
		System.out.println(c);
		c %= 2; //c = c mod 2; 0 ou 1 - resto da divis�o
		System.out.println(c);
		
		c++; //c = c + 1;
		c--; //c = c - 1;
	}
}
