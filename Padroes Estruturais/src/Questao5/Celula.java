package Questao5;

public class Celula implements Componente {
	
	private String conteudo;
	
	public Celula(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public static String padRight(String s, int n) {
	     return String.format("%-" + n + "s", s);  
	}

	@Override
	public void imprimir() {
		conteudo = conteudo + " ";
		
		
		System.out.print(" | "+padRight(conteudo, 15));
	}
	
	
}
