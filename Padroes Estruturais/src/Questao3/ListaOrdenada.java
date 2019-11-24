package Questao3;

import java.util.Collections;

public class ListaOrdenada extends AbstracaoLista{

	public ListaOrdenada(ImplementacaoLista lista) {
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
		System.out.println("Imprimindo na ordenada:");
		Collections.sort(lista.getLista());
		lista.imprime_itens_lista();
	}

	
}

