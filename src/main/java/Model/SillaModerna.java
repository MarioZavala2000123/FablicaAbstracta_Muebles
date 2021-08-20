package Model;

import Interface.iSilla;

public class SillaModerna implements iSilla {

	@Override
	public void tienePatas() {
		System.out.println("Silla moderna tiene una base solida para las patas");
		
	}

	@Override
	public void sentarse() {
		System.out.println("Silla moderna tiene base solida para sentarse");
		
	}
	

}
