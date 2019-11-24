package Questao3;

public class teste {

	public static void main(String[] args) {
		System.out.println("Lista Ordena");
		ImplementacaoLista listaNumeros = new ImprimeNumeros();
		AbstracaoLista listaOrdenada = new ListaOrdenada(listaNumeros);
		listaOrdenada.adicionar("b");
		listaOrdenada.adicionar("c");
		listaOrdenada.adicionar("a");
		listaOrdenada.imprimir();
		
		ImplementacaoLista listaNumeros2 = new ImprimeNumeros();
		System.out.println("\n");
		System.out.println("Lista Não Ordenada");
		AbstracaoLista listaDesordenada = new ListaNaoOrdenada(listaNumeros2);
		listaDesordenada.adicionar("c");
		listaDesordenada.adicionar("a");
		listaDesordenada.adicionar("b");
		listaDesordenada.imprimir();
		
		
		
	
		
	}

}
