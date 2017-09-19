package br.senai.sp.informatica.erros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void dividir(Scanner teclado) throws ArithmeticException, InputMismatchException {
		System.out.println("N�mero: ");
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
				continua = false; // encerrar as repeti��es
			// Recebe o erro e faz algo
			} catch (ArithmeticException | InputMismatchException e) {
				System.err.println("N�mero inv�lido !");
				teclado.nextLine();
			// Executa o programa tendo erros ou n�o
			} finally {
				System.out.println("Finally Executado !");
//				teclado.nextLine();
			}
		} while(continua);
		teclado.close();
		

	}

}
