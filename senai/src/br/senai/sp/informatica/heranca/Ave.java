package br.senai.sp.informatica.heranca;

public class Ave extends Animal {
	
	public Ave(double peso, String comida) {
		super(peso, comida);
	}
	
	void voar() {
		System.out.println("Vooou !");
	}
	
	void botar() {
		System.out.println("Botou um ovo !");
	}
	
}
