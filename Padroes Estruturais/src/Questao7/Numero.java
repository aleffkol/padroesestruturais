package Questao7;

public abstract class Numero {
	int valor = 0;
	public Numero() {}
	public Numero(int v) {
		this.valor = v;
	}
	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public abstract void imprimir();
	
	
}
