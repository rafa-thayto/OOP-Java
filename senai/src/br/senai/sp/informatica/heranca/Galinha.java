package br.senai.sp.informatica.heranca;

public class Galinha extends Ave {

	public Galinha(double peso, String comida) {
		super(peso, comida);
	}
	
	// Polimorfismo
	@Override
	void fazerBarulho() {
		System.out.println("Cocoricóoooooooo !");;
	}
	
}
