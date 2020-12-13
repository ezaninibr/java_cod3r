package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		
		double parteA, parteB, parteC;
		
		parteA = (Math.pow((6*(3+2)),2))/(3*2);
		parteB = Math.pow(((1-5) * (2-7))/2,2);
		parteC = Math.pow(parteA - parteB, 3) / Math.pow(10, 3);
		
		System.out.println(parteC);
	}
}
