package arrays;

import java.util.Scanner;

public class ExercicioArrays {
	public static void main(String[] args) {
	
		int notas = 0;
		double entradaNota = 0;
		double soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantas notas voc� quer incluir: ");
		notas = entrada.nextInt();
		
		double[] notasEntrada = new double[notas];
		
		for(int i = 1; i <= notasEntrada.length; i++) {
			System.out.printf("Digite a %d� nota: ", i);
			entradaNota = entrada.nextDouble();
			soma += entradaNota;
		}
		
		System.out.printf("A m�dia de %d notas � %.2f", notas,  (soma/notas));
		
		entrada.close();
	}
}
