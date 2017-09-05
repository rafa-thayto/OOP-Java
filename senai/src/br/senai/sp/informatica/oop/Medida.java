package br.senai.sp.informatica.oop;

public enum Medida {
	MM("Milímetro"), CM("Centímetro"), M("Metro");
	
	// Enums pode ter Atributos
	public String tipo;
	
	// Contrutores
	Medida(String tipo) {
		this.tipo = tipo;
	}
	
}
