package br.senai.sp.informatica.logica;
import java.util.ArrayList;
public class FluxoForeach {
	public static void main(String[] args) {
		
		int[] pares = {2,4,6,8};
		
		for(int par : pares) {
			System.out.println(par);
		}			
		
		for(int p : pares) {
			// tenta encontrar um numero
			if(p == 6) {
				System.out.println("Achei");
				break;
			} else {
				System.out.println("Nao tem biscoito");
			}
		}
		
		String[] nomes = {
			"Maria", "Eduarda", "Jorge", "Ana"
		};
		
		for(String n : nomes) {
			System.out.println(n);
		}
		
		ArrayList<Integer> lista = 
		new ArrayList<Integer>(); 
		
		// adiciona os elementos ao arraylist
		// lista.add(0)
		// lista.add(1)
		for(int i = 0; i < 10; i++) {
			lista.add(i);
		}
		
		for(int n : lista) {
			System.out.println(n);
		}
	}
}