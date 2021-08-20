package Factory;

import Interface.iSilla;
import Interface.iSillon;
import Model.SillaModerna;
import Model.SillaVictoriana;
import Model.SillonModerna;
import Model.SillonVictoriana;

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
