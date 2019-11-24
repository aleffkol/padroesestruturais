package Questao7;

public class ParentesesDecorator extends NumeroDecorator{

	
	public ParentesesDecorator(Numero numero) {
		super(numero);
	}

	@Override
	public void imprimir() {
		System.out.println("("+numero.getValor()+")");
	}

}
