package br.senai.sp.informatica.logica;
public class Enquanto {
	
	public static void main(String[] args) {
	
		// while
		int i = 0;
		
		while(i < 6) {
			System.out.println(i);
			i++;
		}
		
		int x = 10;
		while(x >= 0) {
			System.out.println(x);
			x--;
		}
		
		int y = 0;
		do {
			System.out.println(y);
			y++;
		} while(y < 10);
		
		int a = 10;
		System.out.println("while");
		while(a < 10) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("do..while");
		do {
			System.out.println(a);
			a++;
		}while(a < 10);
			
		System.out.println(10 < 10);	
		System.out.println(11 < 10);
	}
}