package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		System.out.println("Para sair digite 'SAIR'");
		
		while (!texto.equalsIgnoreCase("sair")) {
			
			texto = entrada.nextLine(); 
		}
		
		entrada.close();
	}
}
