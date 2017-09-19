package br.senai.sp.informatica.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void dividir(Scanner teclado) throws ArithmeticException, InputMismatchException {
		System.out.println("Número: ");
		int n = teclado.nextInt();
		System.out.println("Divisor: ");
		int divisor = teclado.nextInt();
		System.out.println("Resultado: " + n / divisor);
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		boolean continua = true;
		// Tentar
		do {
			try {
				dividir(teclado);
				continua = false; // encerrar as repetições
			// Recebe o erro e faz algo
			} catch (ArithmeticException | InputMismatchException e) {
				System.err.println("Número inválido !");
				teclado.nextLine();
			// Executa o programa tendo erros ou não
			} finally {
				System.out.println("Finally Executado !");
//				teclado.nextLine();
			}
		} while(continua);
		teclado.close();
		

	}

}
