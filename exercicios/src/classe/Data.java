package classe;

public class Data {
	int dia; //variavel da instância
	int mes;
	int ano;
	
	Data(){
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia; // this.variavel_da_instância.
		this.mes = mes;
		this.ano = ano;
	}
	
	String dataFormatada() {
		return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(dataFormatada());
	}
	
}
