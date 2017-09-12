package br.senai.sp.informatica.heranca;
// Quando voc� coloca final na classe, ela n�o pode mais ser herdada
public /*final*/ class Cachorro extends Animal {
	
	public Cachorro(double peso, String comida) {
		super(peso, comida);
	}

	// M�todos
	void enterrarOsso() {
		System.out.println("Enterrou um osso !");
	}

	@Override
	void fazerBarulho() {
		
	}
}
