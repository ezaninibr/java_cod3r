package colecoes;

import java.util.*;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome); // acessa pelo �ndice
		
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		for (Usuario u: lista) {
			System.out.println(u);
		}
	}
}
