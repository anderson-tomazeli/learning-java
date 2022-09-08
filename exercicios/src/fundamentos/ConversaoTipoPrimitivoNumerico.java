package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		double a = 1; // Conversão implícita
		System.out.println(a);
		
		
		// Tente evitar ao máximo o uso do cast
		float b = (float) 1.23456788888; //Cast - conversão explícita
		System.out.println(b);
		
		int c = 128;
		byte d = (byte) c; // explícita - cast
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}
}
