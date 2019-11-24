package Questao7;

public class ChavesDecorator extends NumeroDecorator{

	
	public ChavesDecorator(Numero numero) {
		super(numero);
	}

	@Override
	public void imprimir() {
		System.out.println("{"+numero.getValor()+"}");
	}

}