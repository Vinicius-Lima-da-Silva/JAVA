package veiculos;

public class Veiculos {
	private String placa; 
	private String identificacao;


public String getPlaca() {
	return placa;
}
public void setPlaca(String placa) {
	this.placa = placa;
}
public String getIdentificacao() {
	return identificacao;
}
public void setIdentificacao(String identificacao) {
	this.identificacao = identificacao;
}

public Veiculos(String placa, String identificacao) {
	this.identificacao = identificacao;
	this.placa = placa; 
	
	}


}
