package fundamentos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		System.out.println(2+3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); //o resultado de uma divis�o entre inteiros ser� outro valor inteiro
		System.out.println(a / (double) b); //casting (convers�o) do tipo int para double da var b e teremos um resultado em double
		System.out.println(a / (float) b); //casting (convers�o) do tipo int para float(precis�o menor que double) da var b e teremos um resultado em float
		System.out.println(a % b); //m�dulo (resto) -> 8/3 = 6 -> sobra 2 de resto		
	}
}
