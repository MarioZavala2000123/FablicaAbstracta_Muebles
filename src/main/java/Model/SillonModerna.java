package Model;

import Interface.iSillon;

public class SillonModerna implements iSillon {

	@Override
	public void tienePatas() {
		
		System.out.println("Sillón Moderno tiene una base solida para las patas");
	}

	@Override
	public void numeroPersonas() {
		
		System.out.println("Sillón Moderno poseen una base solida para sentarse");
		
	}
	

}
