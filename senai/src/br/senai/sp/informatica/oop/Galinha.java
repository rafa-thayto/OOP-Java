package br.senai.sp.informatica.oop;

public class Galinha {

	// Variável global (pertence a classe e não a cada objeto)
	public static int ovosDaGranja;
	
	// Ovos que a galinha botou
	public int ovos;
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double mediaDeOvos(int galinhas) {
		// Calcula a média de ovos
		return Galinha.ovosDaGranja / galinhas;
	}
	
	
}
