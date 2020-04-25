package adapters;

import impressoras.Epson;
import programa.ImpressoraInterface;

public class ImpressoraEpsonAdapter extends Epson implements ImpressoraInterface{


	@Override
	public void imprimir(){
		
		super.imprimirEpson();
		
	}
	



}
