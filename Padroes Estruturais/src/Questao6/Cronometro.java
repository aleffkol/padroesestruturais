package Questao6;

public class Cronometro extends Interceptador {
	
	private int n;

	public Cronometro(Componente componente , int n) {
		super(componente);
		this.n = n;
	}

	@Override
	public void executarTarefa() {
		
		for(int i=1; i<=n; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.getComponente().executarTarefa();
		
	}
	

}
