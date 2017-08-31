package br.senai.sp.informatica.oop;

public class CarroTestDrive {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		ferrari.modelo = "Ferrari Enzo";
		ferrari.segundosZeroACem = 3.2;
		ferrari.cor = "Vermelho";
		ferrari.velocidadeMaxima = 349;
		
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		
		// Associa o motor ao carro
		ferrari.motor = v12;
		
		Carro koegnisegg = new Carro("Koenigsegg CCXR", 430, "Preto", 2.3);
		Motor v8 = new Motor("V8", 1018);
		koegnisegg.motor = v8;
		
		System.out.println("Modelo Ferrari: " + ferrari.modelo);
		System.out.println("Modelo koegnisegg: " + koegnisegg.modelo);
		
		Carro bugatti = new Carro("Bugatti Veyron", 430, "Amarelo", 2.2, new Motor("W16", 1200));
		
		System.out.println("Modelo Ferrari: " + ferrari.modelo);
		System.out.println("Pot�ncia: " + ferrari.motor.potencia);
		System.out.println("Tipo de Motor: " + ferrari.motor.tipo);
		
		System.out.println("Modelo koegnisegg: " + koegnisegg.modelo);
		
		
		
	}
	
}