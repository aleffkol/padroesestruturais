package Questao6;

import java.util.Calendar;


public class VerificadorDeMinuto extends Interceptador {

	public VerificadorDeMinuto(Componente componente) {
		super(componente);
		
	}
	
	@Override
	public void executarTarefa() {
		Calendar calendar = Calendar.getInstance();
		int minutos = calendar.get(Calendar.MINUTE);
		int horas = calendar.get(Calendar.HOUR);
		if(minutos % 2 == 0) {
			System.out.println("Execução interrompida em minuto par = "+horas+":"+minutos);
			System.exit(1);
		}
		this.getComponente().executarTarefa();
		
		
	}

}
