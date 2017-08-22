import java.util.Scanner;
import java.util.Random;
public class NumberGame {
	
	public static void main(String[] args) {
		
		boolean modoTrapaca = true;
				
		// sorteia um número do dado
		Random random = new Random();
		// gera um numero aleatorio entre 0 e 5 
		// se for sorteado 0 + 1 (1)
		// se for sorteado 5 + 1 (6)
		int dado = random.nextInt(6) + 1;
		
				
		if(modoTrapaca) {
			System.out.println("Dado: " + dado);
		}
		
		Scanner teclado = new Scanner(System.in);
		// solicita que o usuário digite um número
		System.out.print("Informe seu palpite: ");
		
		int palpite = teclado.nextInt();
		
		if(palpite < 1 || palpite > 6) {
			System.out.println("Digite um numero entre 1 e 6");
		}
		
		// verifica se o usuario acertou
		if (palpite == dado) {
			System.out.println("Acertou");
		} else {
			System.out.println("Errou");
		}
	}
}