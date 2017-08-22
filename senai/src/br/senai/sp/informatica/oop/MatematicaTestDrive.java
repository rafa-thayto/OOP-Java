package br.senai.sp.informatica.oop;

public class MatematicaTestDrive {

	public static void main(String[] args) {

		Matematica matematica = new Matematica();
		
		int maior = matematica.maior(20, 10);
		System.out.println(maior);
		
		double soma = matematica.soma(10, 20);
		System.out.println(soma);
		
		// Determina o maior n�mero par
		int par = matematica.maior(2, 4);
		
		// Determina o maior n�mero �mpar
		int impar = matematica.maior(3, 5);
		
		// Soma o maior par e o maior �mpar
		soma = matematica.soma(par, impar);
		
		System.out.println(soma);
		
		soma = matematica.soma(matematica.maior(2, 4), matematica.maior(3, 5));
		
		System.out.println(matematica.raizPell(9));
		
	}

}
