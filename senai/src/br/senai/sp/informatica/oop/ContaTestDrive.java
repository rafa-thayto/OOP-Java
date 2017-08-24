package br.senai.sp.informatica.oop;

public class ContaTestDrive {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setCliente("Jorge");
		conta.setSaldo(1_000_000_000);
		conta.getSaldo();
		conta.saca(1000);
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.setCliente("Rafael");
		destino.setSaldo(2000);
		destino.getSaldo();

		// Transfere dinheiro do Jorge para o Bob
		conta.transferePara(destino, 1550);
		conta.exibeSaldo();
		destino.exibeSaldo();
		
		Conta xablau = new Conta();
		xablau.setSaldo(1_000_000_000);
		xablau.setCliente("Xablau");
		xablau.exibeSaldo();
		xablau.transferePara(conta, 20);
		
	}

}
