package br.senai.sp.informatica.heranca;

public class InterfaceTeste {

		
		public static void area(AreaCalculada a) {
			System.out.println(a.calculaArea());
		}
		
		public static void main(String[] args) {
			area(new Quadrado(2));
			area(new Cubo(2));
		}


}
