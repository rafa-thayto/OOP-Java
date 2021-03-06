package br.senai.sp.informatica.oop;

public class PessoaTestDrive {

	public static void main(String[] args) {
		
		Pessoa trump = new Pessoa();
		
		trump.nome = "Trump";
		trump.idade = 200;
		
		System.out.println("Idade do Trump: " + trump.idade + " anos!");
		
		trump.fazerAniversario();
		trump.fazerAniversario();
		trump.fazerAniversario();
		
		Pessoa obamis = new Pessoa();
		obamis.nome = "Obama";
		obamis.idade = 27;
		System.out.println("Idade do Obama: " + obamis.idade + " anos!");
		obamis.fazerAniversario();
		
		// Comparando as idades de Trump e Obamis
		int diferenca = Math.abs(trump.idade - obamis.idade); 
		System.out.println("A diferen�a de idade � de: " + diferenca + " anos!");
	}

}
