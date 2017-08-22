package senai;

public class CachorroTestDrive {

	public static void main(String[] args) {

		// Cria uma nova instância de cahorro
		Cachorro pitbull = new Cachorro();
		
		// Define os atributos da instância
		pitbull.raca = "Pitbull";
		pitbull.tamanho = 30;
		
		// Executa o método latir
		pitbull.latir();
		
		Cachorro toto = new Cachorro();
		toto.raca = "Vira-lata";
		toto.tamanho = 25;
		toto.latir();
		
	}

}
