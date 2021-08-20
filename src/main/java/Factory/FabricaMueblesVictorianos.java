package Factory;

import Interface.iSilla;
import Interface.iSillon;
import Model.SillaVictoriana;
import Model.SillonVictoriana;

public class FabricaMueblesVictorianos extends FabricaAbstracta {

	@Override
	public iSilla getiSilla(String tipoSilla) {
		
		if (tipoSilla.equalsIgnoreCase("SILLA")) {
			return new SillaVictoriana();
		
		}
		
		return null;
	}

	@Override
	public iSillon getiSillon(String tipoSillon) {
		
		if (tipoSillon.equalsIgnoreCase("SILLON")) {
			return new SillonVictoriana();
		}
		
		return null;
	}
	

}
