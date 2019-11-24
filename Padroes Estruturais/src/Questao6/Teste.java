package Questao6;


public class Teste {
	public static void main(String[] args) {
		new Interceptador(new Log(new VerificadorDeMinuto(new Cronometro(new ComponenteConcreto(),10)))).executarTarefa();
	}

}
