package motorista;

public class Motorista {
	private String CPF; 
	private String CNH;
	
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getCNH() {
		return CNH;
	}
	public void setCNH(String CNH) {
		this.CNH = CNH;
	} 
	
	public Motorista(String CPF, String CNH) {
		this.CNH = CNH;
		this.CPF = CPF;
	}
	
}
