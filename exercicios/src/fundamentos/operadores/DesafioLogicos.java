package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalhoTerça = true;
		boolean trabalhoQuinta = true;
		
		boolean comprouTv50 = trabalhoTerça && trabalhoQuinta;
		boolean comprouTv32 = trabalhoTerça ^ trabalhoQuinta;
		boolean comprouSorvete = comprouTv32 || comprouTv50;
		
		System.out.println("Comprou TV 50\"? " + comprouTv50);
		System.out.println("Comprou TV 32\"? " + comprouTv32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		
		System.out.println("Mais saudável? " + !comprouSorvete);
	}
}
