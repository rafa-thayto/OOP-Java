package br.senai.sp.informatica.oop;

import java.util.ArrayList;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		ArrayList<Galinha> galinhas = new ArrayList<Galinha>();
		

		Galinha coco = new Galinha();
		coco.botar().botar().botar().botar();
		System.out.println(coco.ovos);
		
		Galinha penosa = new Galinha();
		penosa.botar().botar();
		System.out.println(penosa.ovos);
		
		galinhas.add(coco);
		galinhas.add(penosa);
	
		System.out.println("Ovos da granja " + Galinha.ovosDaGranja);
		
//		System.out.println("M�dia de ovos: " + Galinha.mediaDeOvos(2));
		
		System.out.println("M�dia de ovos: " + Galinha.mediaDeOvos(galinhas.size()));
		
	}

}
