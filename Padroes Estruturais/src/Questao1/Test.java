package Questao1;



public class Test {
	public static void main(String[] args) {
		String ChaVal[] = new String[2];
		ChaVal[0] = "Chave";
		ChaVal[1] = "Valor";
		AdapterHashMap ahm = new AdapterHashMap(ChaVal);
		System.out.println(ahm);
	}
}
