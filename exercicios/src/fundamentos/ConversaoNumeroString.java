package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString() + "  --> String1");
		System.out.println("length " + num1.toString().length());
		
		int num2 = 100000;
		System.out.println("\n" + Integer.toString(num2) + " --> String2");
		System.out.println("length " + Integer.toString(num2).length());

		//Converts based on the concatenation with a string
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}
}
