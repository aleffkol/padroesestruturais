package Questao3;

public class ImprimeLetras extends ImplementacaoLista{

	@Override
	public void imprime_itens_lista() {
		for(String item: lista) {
			System.out.println(item + " " + "a");
		}
	}
	
}
