package br.senai.sp.informatica.heranca;

public class Pombo extends Animal {

	public Pombo(double peso, String comida) {
		super(peso, comida);
	}

	@Override
	void fazerBarulho() {
		System.out.println("Pru pru pru viado !!!");
	}
	
}
