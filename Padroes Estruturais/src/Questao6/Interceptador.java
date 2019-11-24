package Questao6;

public class Interceptador implements Componente {
	private Componente comp;



	public Interceptador(Componente comp) {
		this.comp = comp;
	}



	public Componente getComponente() {
		return comp;
	}



	@Override
	public void executarTarefa() {
		long antes = System.currentTimeMillis();
		comp.executarTarefa();
		long depois = System.currentTimeMillis();
		System.out.println(depois - antes+" ms");


	}
	
	

}


