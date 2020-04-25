package impressoras;

import programa.ImpressoraInterface;

public class HP implements ImpressoraInterface {
	
	@Override
	public void imprimir(){
		System.out.println("Imprimindo HP...");
	}

}
