package Questao7;

public abstract class NumeroDecorator extends Numero{
	Numero numero;
	
	public NumeroDecorator(Numero numero) {
		this.numero = numero;
	}

	@Override
	public abstract void imprimir();
	
	
}
