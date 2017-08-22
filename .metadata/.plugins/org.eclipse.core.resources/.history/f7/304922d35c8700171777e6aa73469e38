import java.util.Random;
public class CardGame {
	
	public static void main(String[] args) {
		
		String[] faces = {
			"A", "2", "3", "4", "5", "6",
			"7", "8", "9", "10", "J", "Q", "K"
		};
		
		String[] naipes = {
			"Espadas", "Paus", "Copas", "Ouros"
		};
		
		// cria uma variavel do tipo Random
		// java.util.Random
		Random random = new Random();
		
		// gera um número aleatorio 
		// entre 0 e 10
		// System.out.println(random.nextInt(10));
		
		// sorteia uma face
		// sorteia um número aleatorio
		// entre zero e o total de faces
		int indiceFace = random.nextInt(faces.length);
		// sorteia uma face
		String face = faces[indiceFace];
		
		int indiceNaipe = random.nextInt(naipes.length);
		String naipe = naipes[indiceNaipe];
		
		// monta a carta	
		String carta = face + " " + naipe;
		
		System.out.println(carta);
		
	}
	
}