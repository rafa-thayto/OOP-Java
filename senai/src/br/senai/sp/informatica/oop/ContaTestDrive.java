package br.senai.sp.informatica.oop;

public class ContaTestDrive {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.cliente = "Jorge";
		conta.saldo = 10_000.00;
		conta.exibeSaldo();
		conta.saca(1000);
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Bob";
		destino.saldo = 1000;
		destino.exibeSaldo();

		// Transfere dinheiro do Jorge para o Bob
		conta.transferePara(destino, 1550);
		conta.exibeSaldo();
		destino.exibeSaldo();
		
		Conta xablau = new Conta();
		xablau.saldo = 1_000_000_000.00;
		xablau.cliente = "Xablau";
		xablau.exibeSaldo();
		xablau.transferePara(conta, 20);
		
	}

}