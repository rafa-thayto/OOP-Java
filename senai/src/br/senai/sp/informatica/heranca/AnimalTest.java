package br.senai.sp.informatica.heranca;

public class AnimalTest {

	public static void main(String[] args) {
		Galinha penosa = new Galinha(2, "Milho");
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
		System.out.println(pitbull instanceof Galinha);
		
	}

}
