package br.senai.sp.informatica.heranca;

public class OperacaoTeste {

	public static void calcule(OperacaoMatematica o, double x, double y) {
		System.out.println(o.calcular(x, y));
	}
	
	public static void main(String[] args) {

		calcule(new Soma(), 5, 5);
		
	}

}
