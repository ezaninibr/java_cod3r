package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obtem o pr�ximo da fila 
		// (sem remover)
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
	}
}
