package br.senai.sp.informatica.logica;
import java.util.Scanner;
/**
* Programa que realizar diversos calculos
* com circulos
* @Author Jorge Rabello
*/
public class CalculosCirculo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o valor do raio: ");
		double raio = teclado.nextDouble();
		System.out.println(teclado);
		
		// calcula o diâmetro de um círculo
		// diametro = 2 * raio
		// double raio = 10; // 10cm
		
		double diametro = 2 * raio;
		
		System.out.println("Diâmetro: " + diametro + " cm");
		
		// calcula a circunferência
		// circunferencia = 2PIraio
		// double pi = Math.PI;
		// System.out.println(PI);
		double circunferencia = 2 * Math.PI * raio;
		System.out.println("Circunferência: " + circunferencia +" cm");
		
		// calcula a área do circulo
		// area = PI * (raio * raio)
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("Area: " + area + " cm2");
	}
	
}