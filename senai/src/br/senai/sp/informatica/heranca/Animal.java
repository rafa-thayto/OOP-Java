package br.senai.sp.informatica.heranca;

public abstract class Animal {
	
	protected double peso;
	protected String comida;
	private String nome;
	
	// métodos implementados
	public Animal(double peso, String comida) {
		super();
		this.peso = peso;
		this.comida = comida;
	}

	void dormir() {
		System.out.println("Dormiu");
	}
	
	
	// métodos a implementar
	abstract void fazerBarulho();
	
	
}
