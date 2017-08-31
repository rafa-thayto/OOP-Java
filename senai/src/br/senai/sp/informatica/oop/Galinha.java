package br.senai.sp.informatica.oop;

public class Galinha {

	// Vari�vel global (pertence a classe e n�o a cada objeto)
	public static int ovosDaGranja;
	
	// Ovos que a galinha botou
	public int ovos;
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double mediaDeOvos(int galinhas) {
		// Calcula a m�dia de ovos
		return Galinha.ovosDaGranja / galinhas;
	}
	
	
}
