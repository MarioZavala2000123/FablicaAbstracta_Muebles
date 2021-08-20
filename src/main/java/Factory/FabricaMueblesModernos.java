package Factory;

import Interface.iSilla;
import Interface.iSillon;
import Model.SillaModerna;
import Model.SillonModerna;


public class FabricaMueblesModernos extends FabricaAbstracta {

	@Override
	public iSilla getiSilla(String tipoSilla) {
		
		if (tipoSilla.equalsIgnoreCase("SILLA")) {
			return new SillaModerna();
		}
		
		return null;
	}

	@Override
	public iSillon getiSillon(String tipoSillon) {
		
		if (tipoSillon.equalsIgnoreCase("SILLON")) {
			return new SillonModerna();
		}
		
		return null;
	}

}
