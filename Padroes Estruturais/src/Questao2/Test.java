package Questao2;


public class Test {

	public static void main(String[] args) {
		
		ImplementacaoRefrigerante dolly = new Dolly();
		AbstracaoTamanho tamanho_pequeno = new TamanhoPequeno(dolly);
		AbstracaoTamanho tamanho_medio = new TamanhoMedio(dolly);
		AbstracaoTamanho tamanho_grande = new TamanhoGrande(dolly);
		AbstracaoTamanho tamanho_familia= new TamanhoFamília(dolly);
		
		System.out.println("tamano Pequeno");
		tamanho_pequeno.beber();
		System.out.println("tamano Medio");
		tamanho_medio.beber();
		System.out.println("tamano Grande");
		tamanho_grande.beber();
		System.out.println("tamano Familia");
		tamanho_familia.beber();
		
		ImplementacaoRefrigerante guarapete = new Guarapete();		
		tamanho_pequeno = new TamanhoPequeno(guarapete);
		tamanho_medio = new TamanhoMedio(guarapete);
		tamanho_grande = new TamanhoGrande(guarapete);
		tamanho_familia = new TamanhoFamília(guarapete);
		
		System.out.println("tamano Pequeno");
		tamanho_pequeno.beber();
		System.out.println("tamano Mediao");
		tamanho_medio.beber();
		System.out.println("tamano Grande");
		tamanho_grande.beber();
		System.out.println("tamano Familia");
		tamanho_familia.beber();
		
		ImplementacaoRefrigerante jesus = new Jesus();
		tamanho_pequeno = new TamanhoPequeno(jesus);
		tamanho_medio = new TamanhoMedio(jesus);
		tamanho_grande = new TamanhoGrande(jesus);
		tamanho_familia = new TamanhoFamília(jesus);
		
		System.out.println("tamano Pequeno");
		tamanho_pequeno.beber();
		System.out.println("tamano Medio");
		tamanho_medio.beber();
		System.out.println("tamano Grande");
		tamanho_grande.beber();
		System.out.println("tamano Familia");
		tamanho_familia.beber();
		
		ImplementacaoRefrigerante sprite = new Sprite();
		tamanho_pequeno = new TamanhoPequeno(sprite);
		tamanho_medio = new TamanhoMedio(sprite);
		tamanho_grande = new TamanhoGrande(sprite);
		tamanho_familia = new TamanhoFamília(sprite);
		
		System.out.println("tamano Pequeno");
		tamanho_pequeno.beber();
		System.out.println("tamano Medio");
		tamanho_medio.beber();
		System.out.println("tamano Grande");
		tamanho_grande.beber();
		System.out.println("tamano Familia");
		tamanho_familia.beber();


	}

}
