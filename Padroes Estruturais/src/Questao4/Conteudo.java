package Questao4;

import java.util.ArrayList;


public abstract class Conteudo {
	
	public Conteudo() {}
	
	public String getNome(){
		throw new UnsupportedOperationException();
	}
	public String getNomePasta(){
		throw new UnsupportedOperationException();
	}
	public double getKbs(){
		throw new UnsupportedOperationException();
	}
	public ArrayList getLista() {
		throw new UnsupportedOperationException();
	}
	public void totalArquivos() {}
	public void getArquivos(){}
	public void add(Conteudo c){}
	public void remove(){}
	
}
