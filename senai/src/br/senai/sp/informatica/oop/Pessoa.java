package br.senai.sp.informatica.oop;

public class Pessoa {

	// Atributos
	String nome;
	int idade;
	
	void fazerAniversario() {
		this.idade++;
		System.out.println("O " + this.nome + " fez anivers�rio !");
		System.out.println("A idade de " + this.nome + " � " + this.idade);
	}
	
}
