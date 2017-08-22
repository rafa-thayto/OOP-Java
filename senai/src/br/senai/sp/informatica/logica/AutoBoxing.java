package br.senai.sp.informatica.logica;
public class AutoBoxing {
	
	public static void main(String[] args) {
		
		// boxing - empacotado
		Integer x = new Integer(555);
		// desempacotou, incrementar e
		// re-empacotou
		x++; 
		
		
		Boolean v = new Boolean("true");
		if(v) {
			System.out.println("V");
		} else {
			System.out.println("F");
		}
		
		
		// antes do java 5
		// desempacotar - unboxing
		//int a = x.intValue();
		
		// incrementar
		//a++;
		
		// re-empacotar
		//x = new Integer(a);
			
		System.out.println(x);
	}
}