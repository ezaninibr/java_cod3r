package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		//(F� - 32) x 5/9 = �C ***F�rmula para converter F� em C�
		
		final int FATOR = 32;
		final double DIVISOR = 5/9.0;
		double farenheit;
		double celsius;
		
		farenheit = 150;
		celsius = (farenheit - FATOR) * DIVISOR;
		System.out.println("O resultado � " + celsius + "C�.");
		
	}

}
