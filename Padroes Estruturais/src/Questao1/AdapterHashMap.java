package Questao1;

import java.util.HashMap;

public class AdapterHashMap {
	
	private HashMap<String, String> hm = new HashMap<String, String>();

	public AdapterHashMap(String ChaVal[]) {
		hm.put(ChaVal[0], ChaVal[1]);
	}

	@Override
	public String toString() {
		return "AdapterHashMap [hm= " +hm+ "]";
	}
	
	
	
	
}
