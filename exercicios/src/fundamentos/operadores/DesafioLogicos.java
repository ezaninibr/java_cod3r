package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na ter�a (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalhoTer�a = true;
		boolean trabalhoQuinta = true;
		
		boolean comprouTv50 = trabalhoTer�a && trabalhoQuinta;
		boolean comprouTv32 = trabalhoTer�a ^ trabalhoQuinta;
		boolean comprouSorvete = comprouTv32 || comprouTv50;
		
		System.out.println("Comprou TV 50\"? " + comprouTv50);
		System.out.println("Comprou TV 32\"? " + comprouTv32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		System.out.println("Mais saud�vel? " + !comprouSorvete);
	}
}
