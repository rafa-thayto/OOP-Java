package br.senai.sp.informatica.oop;

public class ContaTestDrive {

	public static void main(String[] args) {
		
		Conta.saldoDoBanco = 1_500.00;
		
		Conta conta1 = new Conta();
		conta1.setCliente("Rafael Thayto");
		conta1.setSaldo(1000);
		
		System.out.println("Saldo da Conta: R$ " + conta1.getSaldo());
		System.out.println("Saldo do Banco: R$ " + Conta.saldoDoBanco);
		
		conta1.saca(50);
		
		System.out.println("Saldo da Conta: R$ " + conta1.getSaldo());
		System.out.println("Saldo do Banco: R$ " + Conta.saldoDoBanco);
		
		Conta c2 = new Conta("Bozo", 100.00);
		System.out.println("Saldo da Conta: R$ " + c2.getSaldo());
		
//		Conta conta = new Conta();
//		conta.setCliente("Jorge");
//		conta.setSaldo(1_000_000_000);
//		conta.getSaldo();
//		conta.saca(1000);
//		conta.exibeSaldo();
//		
//		Conta destino = new Conta();
//		destino.setCliente("Rafael");
//		destino.setSaldo(2000);
//		destino.getSaldo();
//
//		// Transfere dinheiro do Jorge para o Bob
//		conta.transferePara(destino, 1550);
//		conta.exibeSaldo();
//		destino.exibeSaldo();
//		
//		Conta xablau = new Conta();
//		xablau.setSaldo(1_000_000_000);
//		xablau.setCliente("Xablau");
//		xablau.exibeSaldo();
//		xablau.transferePara(conta, 20);
		
	}

}
