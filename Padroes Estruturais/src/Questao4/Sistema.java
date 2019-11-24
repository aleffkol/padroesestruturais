package Questao4;



public class Sistema {

	private static double kbsDisponivel = 200;
	
	public static void totalConteudo(Conteudo c) {
	
		System.out.println("Total de Arquivos no Sistema");
		c.totalArquivos();
	}
	
//	public static void totalKbs() {
//		System.out.println("Total de kbs disponivel: " + kbsDisponivel);
//	}
	
	public static void main(String[] args) {
		
		Conteudo sistema = new ArquivoComposite("Sistema");
		Conteudo p1 = new ArquivoComposite("Pasta 1");
		Conteudo p2 = new ArquivoComposite("Pasta 2");
		
		Conteudo a1 = new Arquivo("Arquivo 1", 1);
		Conteudo a2 = new Arquivo("Arquivo 2", 2);
		Conteudo a3 = new Arquivo("Arquivo 3", 3);
		Conteudo a4 = new Arquivo("Arquivo 4", 4);
		Conteudo a5 = new Arquivo("Arquivo 5", 5);
		
		sistema.add(p1);
		sistema.add(p2);
		sistema.add(a5);
		
		p1.add(a1);
		p1.add(a2);
		
		p2.add(a3);
		p2.add(a4);
		
		sistema.getArquivos();
		totalConteudo(sistema);
//		totalKbs();

	}
}

