package edu.uspg;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import Factory.FabricaMueblesModernos;
import Factory.FabricaMueblesVictorianos;
import Interface.iMesa;
import Interface.iSilla;



@SpringBootApplication
public class FabricaAbstrataMueblesApplication {
		
	public static void main(String[] args) {
		
			//Modernos
		System.out.println("   -----Muebles Modernos-----");
		System.out.println(" ");
		
		FabricaMueblesModernos fabricaM = new FabricaMueblesModernos();
		
		System.out.println("   ——Silla Moderna——");
		iSilla sillaM = fabricaM.getiSilla("Silla");
		
		sillaM.sentarse();
		sillaM.tienePatas();
		
		System.out.println("////////////////////////////");
		
		System.out.println("   ——Mesa Moderna——");
		iMesa mesaM = fabricaM.getiMesa("Mesa");
		
		mesaM.tienePatas();
		mesaM.numeroPersonas();
		
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");
		
		//Victorianos
		System.out.println("   -----Muebles Modernos-----");
		System.out.println(" ");
		
		FabricaMueblesVictorianos fabricaV = new FabricaMueblesVictorianos();
		
		System.out.println("   ——Silla Victoriana——");
		iSilla sillaV = fabricaV.getiSilla("Silla");
		
		sillaV.sentarse();
		sillaV.tienePatas();
		
		System.out.println("//////////////////////////////////////////");
		
		System.out.println("   ——Mesa Victoriana——");
		iMesa mesaV = fabricaV.getiMesa("Mesa");
		
		mesaV.tienePatas();
		mesaV.numeroPersonas();
		
		
	}

}
