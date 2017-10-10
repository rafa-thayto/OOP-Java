package br.com.senai.sp.informatica.alg.vetor;

public class TestaVetor {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Adalberto");
		Cliente c2 = new Cliente("Bruno");
		Cliente c3 = new Cliente("Camila");
		
		Vetor vetorCliente = new Vetor();
		
		// Adicionando os clientes no vetor
		vetorCliente.adicionar(c1);
		vetorCliente.adicionar(c2);
		vetorCliente.adicionar(c3);
		
		// Pegando os elementos do vetor
		System.out.println(vetorCliente.pegar(0));
		System.out.println(vetorCliente.pegar(1));
		System.out.println(vetorCliente.pegar(2));
		System.out.println(vetorCliente.pegar(3));

	}

}
