package Questao4;

import java.util.ArrayList;



public class ArquivoComposite extends Conteudo {
	private String nome;
	private ArrayList<Conteudo> lista = new ArrayList<Conteudo>();
	
	
	public ArquivoComposite(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void getArquivos() {
		System.out.println("\nLista de Arquivos: ");
		for (int i =0; i<this.lista.size(); i++){
			Conteudo g = (Conteudo)lista.get(i);

			System.out.println(g);
		}
		
	}

	public void add(Conteudo i) {
		System.out.println("Adicionando arquivo");
		lista.add(i);
		System.out.println(i+ " Adicionado");
		
	}

	public void remove(int i) {
		System.out.println("Removendo arquivo");
		lista.remove(i);
	}
	
	public ArrayList<Conteudo> getLista() {
		return lista;
	}
	
	public void totalArquivos() {
		int countArquivo = 0;
		int countPasta = 0;
		for (Object item : this.lista) {
			if (item instanceof ArquivoComposite)
				countPasta+=lista.size();
			else if (item instanceof Arquivo)
				countArquivo++;
		}
		System.out.println("Total: " + (countArquivo + countPasta));
	}

	@Override
	public String toString() {
		return "ArquivoComposite [NomePasta=" + nome + ", lista=" + lista + "]";
	}
	
	
	
	


}
