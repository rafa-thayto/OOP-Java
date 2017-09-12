package br.senai.sp.informatica.heranca;

public class AnimalTest {

	// Polimorfismo
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro(10, "Carne");
		Galinha penosa = new Galinha(5, "Milho");
		Pombo pombo = new Pombo(2, "Cadáver");
//		Animal generico = new Animal(0, null);
		
		barulho(toto);
		barulho(penosa);
		barulho(pombo);
//		barulho(generico);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Galinha penosa = new Galinha(2, "Milho");
		penosa.comida = "Milho";
		penosa.peso = 2;
		penosa.fazerBarulho();
		penosa.dormir();
		penosa.botar();
		penosa.voar();
//		penosa.nome = "Penosa";
		
		Animal pitbull = new Cachorro(30, "Criancinha");
		pitbull.comida = "Criancinha";
		pitbull.peso = 30;
		pitbull.fazerBarulho();
		pitbull.dormir();
//		pitbull.enterrarOsso();
//		pitbull.nome = "Sadam";
		
		Alien et = new Alien(33, "Humanos");
		et.dormir();
		
		// instanceof serve para comparar objetos 
		System.out.println(pitbull instanceof Cachorro);
		System.out.println(pitbull instanceof Animal);
		System.out.println(pitbull instanceof Galinha);*/
		
	}

}
