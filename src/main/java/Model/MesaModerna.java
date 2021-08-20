package Model;

import Interface.iMesa;

public class MesaModerna implements iMesa {

	@Override
	public void tienePatas() {
		System.out.println("Mesa moderna tiene patas solidas y firmes");
		
	}

	@Override
	public void numeroPersonas() {
		System.out.println("Mesa Moderna tiene una capasidad de 8 personas");
		
	}

}
