package Questao6;

import java.util.Date;

public class Log extends Interceptador {
	
	

	public Log(Componente comp) {
		super(comp);
		
	}

	@Override
	public void executarTarefa() {
		Date d = new Date();
		System.out.println(d.toString()+" mensagem de log");
		this.getComponente().executarTarefa();
		
		
	}

}
