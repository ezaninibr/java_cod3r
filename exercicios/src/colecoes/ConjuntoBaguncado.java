package colecoes;

import java.util.HashSet;
import java.util.*;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean ...
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('X');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("Teste");
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
	}
}
