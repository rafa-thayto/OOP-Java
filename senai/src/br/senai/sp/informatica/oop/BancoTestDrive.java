package br.senai.sp.informatica.oop;

public class BancoTestDrive {

	public static void main(String[] args) {

		
		ContaBanco conta = new ContaBanco(1, "Corrente", 10_000.00, new Cliente("Title", "06929749972"));
		
		System.out.println("Dados da Conta");
		System.out.println("N�:              " + conta.getNumero());
		System.out.println("Tipo:            " + conta.getTipo());
		System.out.println("Saldo:           " + conta.getSaldo());
		System.out.println("Titular:         " + conta.cliente.nome);
		System.out.println("CPF do Titular:  " + conta.cliente.cpf);
		conta.getSaldo();
		
		
		
		
		
		
		
	}

}