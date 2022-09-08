package controle;

public class For1 {

	public static void main(String[] args) {
		
		for(int cont = 0; cont <= 20; cont+=2) {
			System.out.printf("i = %d\n", cont);
		}
		
		//another way to do the same thing
		// this way doesn't make sense using for		
		int x = 2;
		for(; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
	}
}
