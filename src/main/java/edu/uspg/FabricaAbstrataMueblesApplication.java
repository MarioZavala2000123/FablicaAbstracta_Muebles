package edu.uspg;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import Factory.FabricaMueblesModernos;
import Factory.FabricaMueblesVictorianos;
import Interface.iSilla;



@SpringBootApplication
public class FabricaAbstrataMueblesApplication {
		
	public static void main(String[] args) {
		
			//Modernos
		System.out.println("   -----Muebles Modernos-----");
		System.out.println(" ");
		
		FabricaMueblesModernos fabricaM = new FabricaMueblesModernos();
		
		iSilla sillaM = fabricaM.getiSilla("Silla");
		
		sillaM.sentarse();
		sillaM.tienePatas();
		
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");
		
		//Victorianos
		System.out.println("   -----Muebles Modernos-----");
		System.out.println(" ");
		
		FabricaMueblesVictorianos fabricaV = new FabricaMueblesVictorianos();
		
		iSilla sillaV = fabricaV.getiSilla("Silla");
		
		sillaV.sentarse();
		sillaV.tienePatas();
		
	}

}
