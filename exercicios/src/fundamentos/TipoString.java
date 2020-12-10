package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Ol� Pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat(" !!!"));
		System.out.println(s + " !!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Perdro";
		var sobreNome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome " + nome + "\nSobrenome: " + sobreNome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.\n\n", nome, sobreNome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobreNome, idade, salario);
		
		System.out.println(frase);
	}
}
