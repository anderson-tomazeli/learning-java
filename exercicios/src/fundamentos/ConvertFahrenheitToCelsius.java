package fundamentos;

import java.util.Scanner;

public class ConvertFahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe F ou C para temperatura:");
		String unitOfMeasure = entrada.next();
		
		System.out.printf("informe um valor para a temperatura em %s", unitOfMeasure);
		double temp = entrada.nextDouble();
		entrada.close();

		String equals = unitOfMeasure.equals('F') ? "Yes" : "No";
		
		System.out.println(equals);
		
	    double result = unitOfMeasure.equals("F") ? ((temp - 32) * 5) / 9 : (temp * 1.8) + 32;
		
		System.out.printf("The temperature in �%s is %.2f", unitOfMeasure, result);
		
		/*double resultado = "+".equals(operador) ? numero1 + numero2 : 0;
		resultado = "-".equals(operador) ? numero1 - numero2 : resultado;
		resultado = "*".equals(operador) ? numero1 * numero2 : resultado;
		resultado = "/".equals(operador) ? numero1 / numero2 : resultado;
		resultado = "%".equals(operador) ? numero1 % numero2 : resultado;
				
		System.out.printf("%.2f %s %.2f = %.2f", numero1, operador, numero2, resultado);*/
		
	}
	
}
