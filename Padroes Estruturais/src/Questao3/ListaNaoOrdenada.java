package Questao3;

public class ListaNaoOrdenada extends AbstracaoLista{

	public ListaNaoOrdenada(ImplementacaoLista lista) {
		super(lista);
	}
	
	@Override
	public void adicionar(String s) {
		
		System.out.println("Adicionado valor:");
		lista.add(s);
		lista.imprime_itens_lista();
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo n�o ordenada:");
		lista.imprime_itens_lista();
	}

}
