package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João",98.70);
		
		Comida c1 = new Comida("Arroz",0.9);	
		Comida c2 = new Comida("Feijão",1.9);	
		Comida c3 = new Comida("Batata",0.6);	
		
		System.out.println(p1.apresentar());
		p1.Comer(c1);
		System.out.println(p1.apresentar());
		p1.Comer(c2);
		System.out.println(p1.apresentar());
		p1.Comer(c3);
		System.out.println(p1.apresentar());
		
	}
	
}
