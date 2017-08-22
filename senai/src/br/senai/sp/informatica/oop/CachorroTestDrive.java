package br.senai.sp.informatica.oop;

public class CachorroTestDrive {

	public static void main(String[] args) {

		// Cria uma nova inst�ncia de cahorro
		Cachorro pitbull = new Cachorro();
		
		// Define os atributos da inst�ncia
		pitbull.nome = "Sadam";
		pitbull.raca = "Pitbull";
		pitbull.tamanho = 30;
		
		// Executa o m�todo latir
		pitbull.latir();
		
		Cachorro toto = new Cachorro();
		toto.nome = "Toto";
		toto.raca = "Vira-lata";
		toto.tamanho = 25;
		toto.latir();
		
	}

}