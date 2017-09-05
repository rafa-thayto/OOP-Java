package br.senai.sp.informatica.oop;


public class EnumTest {

	// Constante
	// Colocar a constante sempre antes do método main
	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		System.out.println(PecasXadrez.RAINHA);
		System.out.println(PecasXadrez.PEAO);
		System.out.println(Medida.MM);
		System.out.println(Medida.MM.tipo);
		
		System.out.println(Medida.M);
		System.out.println(Medida.M.tipo);
		
		for (Medida m : Medida.values()) {
			System.out.println(m + " : " + m.tipo);
		}	
		
		Medida[] ms = Medida.values();
		System.out.println(ms.length);
		System.out.println(ms[1]);
	}

}
