package Questao5;


import java.util.*;

public class Tabela {
	private List<Componente> linhas = new ArrayList<Componente>();
	
	public void adicionar(Componente c) {
		linhas.add(c);
	}
	
	public void imprimir() {
		for(Componente c: linhas) {
			c.imprimir();
			
			
		}
	}
	

}
