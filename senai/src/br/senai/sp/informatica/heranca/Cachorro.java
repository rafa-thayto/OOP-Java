package br.senai.sp.informatica.heranca;

public class Cachorro extends Animal {
	
	public Cachorro(double peso, String comida) {
		super(peso, comida);
	}

	// M�todos
	void enterrarOsso() {
		System.out.println("Enterrou um osso !");
	}
}
