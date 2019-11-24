package Questao2;

public class TamanhoMedio extends AbstracaoTamanho{

	public TamanhoMedio(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void beber() {
		System.out.println("Tomar um gole de " + refrigerante);
		System.out.println("Tomar um gole de " + refrigerante);
		System.out.println("Acabou o(a)" + refrigerante);
		System.out.println();
		// TODO Auto-generated method stub
		
	}

}
