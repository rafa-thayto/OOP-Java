package br.senai.sp.informatica.heranca;
// Quando você coloca final na classe, ela não pode mais ser herdada
public /*final*/ class Cachorro extends Animal {
	
	public Cachorro(double peso, String comida) {
		super(peso, comida);
	}

	// Métodos
	void enterrarOsso() {
		System.out.println("Enterrou um osso !");
	}

	@Override
	void fazerBarulho() {
		
	}
}
