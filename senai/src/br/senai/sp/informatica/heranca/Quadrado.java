package br.senai.sp.informatica.heranca;

public class Quadrado implements AreaCalculada {

	double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		return Math.pow(lado, 2);
	}
}
