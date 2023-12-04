package passageiro;

public class Passageiro {
	private String numeroCartao;
	private String CPF;
	
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public Passageiro(String numeroCartao, String CPF) {
		this.CPF = CPF;
		this.numeroCartao = numeroCartao;
	}
	
}
