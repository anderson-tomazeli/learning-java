package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // Primitivo é int - 1/2 que muda o nome
		Integer iString = Integer.parseInt("10001"); // Convert String to Integer
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i.compareTo(100001));
		System.out.println(iString * 3);
		System.out.println(l.shortValue());
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // Primitivo é char - 2/2 que muda o nome
		System.out.println(c + "...");
	}
}
