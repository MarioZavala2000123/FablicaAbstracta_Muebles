package Factory;

import Interface.iMesa;
import Interface.iSilla;
import Interface.iSillon;
import Model.MesaModerna;
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

	
	@Override
	public iMesa getiMesa(String tipoMesa) {
		
		if (tipoMesa.equalsIgnoreCase("MESA")) {
			
			return new MesaModerna();
			
		}
		
		return null;
	}
	

}
