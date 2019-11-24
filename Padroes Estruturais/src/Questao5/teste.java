package Questao5;

public class teste {
	public static void main(String[] args) {
		
		Componente coluna1 = new Celula("Nome");
		Componente coluna2 = new Celula("Vitórias");
		//Pessoa 1
		Componente nome1 = new Celula("João");
		Componente vitoria1 = new Celula("5");
		//Pessoa 2
		Componente nome2 = new Celula("Chiquinha");
		Componente vitoria2 = new Celula("6");
		//Pessoa 3
		Componente nome3 = new Celula("Mario");
		Componente vitoria3 = new Celula("10");
		//Pessoa 4
		Componente nome4 = new Celula("Pedro");
		Componente vitoria4 = new Celula("5");
		

		//Linhas
		Linha linha1 = new Linha();
		Linha linha2 = new Linha();
		Linha linha3 = new Linha();
		Linha linha4 = new Linha();
		Linha linha5 = new Linha();

		linha1.adicionar(coluna1);
		linha1.adicionar(coluna2);

		linha2.adicionar(nome1);
		linha2.adicionar(vitoria1);

		linha3.adicionar(nome2);
		linha3.adicionar(vitoria2);

		linha4.adicionar(nome3);
		linha4.adicionar(vitoria3);
		
		linha5.adicionar(nome4);
		linha5.adicionar(vitoria4);

		//Tabela
		Tabela tabela = new Tabela();
		
		tabela.adicionar(linha1);
		tabela.adicionar(linha2);
		tabela.adicionar(linha3);
		tabela.adicionar(linha4);
		tabela.adicionar(linha5);
		tabela.imprimir();


	}

}
