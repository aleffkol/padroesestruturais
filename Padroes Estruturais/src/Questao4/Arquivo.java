package Questao4;

public class Arquivo extends Conteudo{
	private String nome = "Nova Pasta";
	private double kbs= 0.0;
	
	public Arquivo() {}
	
	public Arquivo(String nome) {
		this.nome = nome;
	}
	public Arquivo(String nome, double d) {
		this.nome = nome;
		this.kbs = d;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getKbs() {
		return kbs;
	}

	public void setKbs(double kbs) {
		this.kbs = kbs;
	}

	@Override
	public String toString() {
		return "Arquivo [nome=" + nome + ", kbs=" + kbs + "]";
	}
	

	
	
	
	
}
