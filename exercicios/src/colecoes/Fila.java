package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		// diferença é o comportamento quando a fila está cheia!
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obtem o próximo da fila 
		// (sem remover)
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
	}
}
