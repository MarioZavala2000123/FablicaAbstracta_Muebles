package Model;

import Interface.iSilla;

public class SillaVictoriana implements iSilla {
	
	@Override
	public void tienePatas() {
		System.out.println("Silla Victoriana con cuatro patas con molduras");
		
	}
	
	@Override
	public void sentarse() {
		System.out.println("Silla Victoria con base para sentarse con cojin");
	}

}
