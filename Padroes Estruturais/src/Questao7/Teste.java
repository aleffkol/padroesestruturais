package Questao7;

public class Teste {

	public static void main(String[] args) {
		// Numero
		Numero numero = new NumeroUm();
		numero.setValor(1);
		// Decorators
		System.out.println("Parenteses");
		NumeroDecorator parenteses = new ParentesesDecorator(numero);
		parenteses.imprimir();
		System.out.println("\nChaves");
		NumeroDecorator chaves = new ChavesDecorator(numero);
		chaves.imprimir();
		
	}

}
