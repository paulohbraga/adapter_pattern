package programa;

import adapters.ImpressoraEpsonAdapter;
import impressoras.Epson;
import impressoras.HP;
import impressoras.Xerox;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		
		ImpressoraInterface impressora = new Xerox();

		//ImpressoraInterface impressora = new HP();
		
		//ImpressoraEpsonAdapter impressora = new ImpressoraEpsonAdapter();
		
		impressora.imprimir();
		
	}

}
