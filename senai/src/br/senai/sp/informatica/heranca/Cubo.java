package br.senai.sp.informatica.heranca;

public class Cubo implements AreaCalculada, VolumeCalculavel {
	
	double lado;
	
	public Cubo(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return 6 * Math.pow(lado, 2);
	}

	@Override
	public double calculaVolume() {
		return Math.pow(lado, 3);
	}
	
}
