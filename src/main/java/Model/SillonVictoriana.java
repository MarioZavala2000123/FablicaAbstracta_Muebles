package Model;

import Interface.iSillon;

public class SillonVictoriana implements iSillon {

	@Override
	public void tienePatas() {
		System.out.println("Sillón Victoriana, tiene cuatro patas");
		
	}

	@Override
	public void numeroPersonas() {
		System.out.println("Sillón Victoriana, para 3 personas");
		
	}
	

}
