package Model;

import Interface.iSillon;

public class SillonModerna implements iSillon {

	@Override
	public void tienePatas() {
		
		System.out.println("Sillón Moderno tiene base en lugar de patas");
	}

	@Override
	public void numeroPersonas() {
		
		System.out.println("Sillón Moderno tiene capasidad 3 personas");
		
	}
	

}
