package controle;

public class For2 {

	public static void main(String[] args) {
		int x = 0; //this way the var x will be available after the for loop
		//for (x=0; x >=0; x-=2) { // this way, there is no need to declare the variable before but it will be valid only inside the loop
		for (; x >=0; x-=2) {
				System.out.println(x);
		}
	}
}
