package Model;

import Interface.iMesa;

public class MesaVictoriana implements iMesa {

	@Override
	public void tienePatas() {
		
		System.out.println("Mesa Victoriana, tiene cuatro patas");
		
	}

	@Override
	public void numeroPersonas() {
		
		System.out.println("Mesa Victoriana, para 8 personas");
		
	}

}
