package Questao2;

public class TamanhoFamília extends AbstracaoTamanho {

	public TamanhoFamília(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);
	}

	@Override
	public void beber() {
		System.out.println("Tomar um gole de " + refrigerante);
		System.out.println("Tomar um gole de " + refrigerante);
		System.out.println("Tomar um gole de " + refrigerante);
		System.out.println("Tomar um gole de " + refrigerante);
		System.out.println("Tomar um gole de " + refrigerante);
		System.out.println("Acabou o (a)" + refrigerante);
		System.out.println();	
	}

}
