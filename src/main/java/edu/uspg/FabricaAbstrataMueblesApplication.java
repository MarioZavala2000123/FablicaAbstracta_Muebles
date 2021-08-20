package edu.uspg;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import Factory.FabricaMueblesModernos;

@SpringBootApplication
public class FabricaAbstrataMueblesApplication {

	public static void main(String[] args) {
		
		//GetFabricas fabricas = new GetFabricas();
		
	//	GetFabricas iSilla = fabricas.Modernos();
		
		FabricaMueblesModernos modernos = new FabricaMueblesModernos();
		
		modernos.equals(modernos);
	}

}
