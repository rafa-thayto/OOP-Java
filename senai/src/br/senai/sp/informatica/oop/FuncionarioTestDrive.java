package br.senai.sp.informatica.oop;

public class FuncionarioTestDrive {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Ana");
		funcionario.setAtivo(true);
		
		
		// Exibe os dados do funcionário
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Ativo: " + funcionario.isAtivo());
		

	}

}
