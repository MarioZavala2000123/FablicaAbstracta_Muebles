package Factory;

import Interface.iMesa;
import Interface.iSilla;
import Interface.iSillon;

public abstract class FabricaAbstracta {
	
	public abstract iSilla getiSilla(String tipoSilla);
	public abstract iSillon getiSillon(String tipoSillon);
	public abstract iMesa getiMesa(String tipoMesa);

}
