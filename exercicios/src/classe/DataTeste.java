package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 7;
		d1.mes = 11;
		d1.ano = 2021;
		
		Data d2 = new Data();
		d2.ano = 2030;
		
		Data d3 = new Data(31,12,2020);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		System.out.println(d3.dataFormatada());
		
		System.out.println();
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		d3.imprimirDataFormatada();
		
	}
}
