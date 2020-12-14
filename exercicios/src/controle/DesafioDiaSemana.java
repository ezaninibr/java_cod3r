package controle;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		// Domingo -> 1
		// ...
		// Sexta -> 6
		// Sábado -> 7
		
		String dia = JOptionPane.showInputDialog("Escreva o dia da semaana");
		
		if("Segunda".equalsIgnoreCase(dia)) {
			System.out.println("1");
		}else if("Terça".equalsIgnoreCase(dia)) {
			System.out.println("2");
		}else if("Quarta".equalsIgnoreCase(dia)) {
			System.out.println("3");
		}else if("Quinta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		}else if("Sexta".equalsIgnoreCase(dia)) {
			System.out.println("5");
		}else if("Sábado".equalsIgnoreCase(dia)) {
			System.out.println("6");
		}else if("Domingo".equalsIgnoreCase(dia)) {
			System.out.println("7");
		}else {
			System.out.println("Dia não encontrado...");
		}
	}
}
