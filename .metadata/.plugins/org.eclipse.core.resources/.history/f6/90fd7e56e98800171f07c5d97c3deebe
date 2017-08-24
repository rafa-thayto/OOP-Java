package br.senai.sp.informatica.logica;
import java.util.ArrayList;
import java.util.Scanner;
public class Compras {

	public static void main(String[] args) {
		
		ArrayList<String> lista = 
		    new ArrayList<String>();
			
		Scanner teclado = new Scanner(System.in);
		
		String msg = 
		"Liste seus produtos : Para sair digite FIM";
		
		String produto;
		
		// enquanto o produto NÃO for igual a FIM
		// while(!produto.equals("FIM"))
		while(!"FIM".equals(produto = teclado.nextLine())) {
			lista.add(produto);
		}
		
		// mostra os produtos
		System.out.println(lista.toString());
		
		for(String p : lista) {
			System.out.println(p);
		}
		
	}
}