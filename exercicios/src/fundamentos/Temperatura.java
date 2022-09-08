package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		// 32 em uma constante (AJUSTE ou DIFERENCA)
		// 5/9 em outra constante (FATOR ou MULTIPLICADOR)
		// °F e °C em variaveis
		
		double temp_farenheint = 86;
	
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		
		double temp_celsius = (temp_farenheint - AJUSTE) * FATOR;
		
		System.out.println("Temperatura em Celsius: " + temp_celsius + "°C" );
	}
}
