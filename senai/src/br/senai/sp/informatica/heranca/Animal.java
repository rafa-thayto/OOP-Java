package br.senai.sp.informatica.heranca;

public class Animal {
	
	protected double peso;
	protected String comida;
	private String nome;
	
	public Animal(double peso, String comida) {
		super();
		this.peso = peso;
		this.comida = comida;
	}

	void dormir() {
		System.out.println("Dormiu");
	}
	
	void fazerBarulho() {
		System.out.println("AAAAAHHN OOOOOOWWN AAAHN OOOHWN");
	}
}
