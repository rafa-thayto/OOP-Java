package br.senai.sp.informatica.logica;
public class FluxoFor {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) {
			
			System.out.println(i);
		
		}
		
		System.out.println(); // pula uma linha
		
		for(int i = 3; i >= 0; i--) {
			System.out.println(i);
		}
		
		/*
		for(int i = 3; true; i++) {
			System.out.println(i);
		}
		*/
		
	}
}