package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		double superiorA = Math.pow((6*(3+2)), 2);
		double denA = (3 * 2);
		double numA = superiorA / denA;
		
		double superiorB = ((1-5) * (2-7));
		double denB = 2;
		double numB = Math.pow(superiorB / denB, 2);
		
		double inferior = Math.pow(10, 3);
		
		double superior = Math.pow(numA - numB, 3);
		
		double resultadoFinal = superior / inferior;

		System.out.println(numA);
		System.out.println(numB);
		System.out.println(superior);
		System.out.println(inferior);
		System.out.println(resultadoFinal);
	}
}
