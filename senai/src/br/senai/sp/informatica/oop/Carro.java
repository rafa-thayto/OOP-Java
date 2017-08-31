package br.senai.sp.informatica.oop;

public class Carro {

	String modelo;
	int velocidadeMaxima;
	String cor;
	double segundosZeroACem;
	Motor motor;
	
	// Contrutor
	public Carro() {

	}
	
	public Carro(String modelo, int velocidadeMaxima, String cor, double segundosZeroACem) {
		// Inicializa contrutor
		super();
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.cor = cor;
		this.segundosZeroACem = segundosZeroACem;
	}
	
	public Carro(String modelo, int velocidadeMaxima, String cor, double segundosZeroACem, Motor motor) {
		super();
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.cor = cor;
		this.segundosZeroACem = segundosZeroACem;
		this.motor = motor;
	}

	public Carro(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}
	
	
	
	
	
}
