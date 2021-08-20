package edu.uspg;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import Factory.FabricaMueblesModernos;
import Interface.iSilla;



@SpringBootApplication
public class FabricaAbstrataMueblesApplication {
		
	public static void main(String[] args) {
		
		FabricaMueblesModernos fabrica = new FabricaMueblesModernos();
		
		iSilla silla = fabrica.getiSilla("Silla");
		
		silla.sentarse();
		silla.tienePatas();
	}

}
