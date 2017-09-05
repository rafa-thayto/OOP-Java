package br.senai.sp.informatica.oop;

public enum Medida {
	MM("Mil�metro"), CM("Cent�metro"), M("Metro");
	
	// Enums pode ter Atributos
	public String tipo;
	
	// Contrutores
	Medida(String tipo) {
		this.tipo = tipo;
	}
	
}
