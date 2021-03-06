package br.senai.sp.informatica.oop;

public class ContaBanco {
	private int numero;
	private String tipo;
	private double saldo;
	public Cliente cliente;
	public static double saldoDoBanco;
	
	
	// Contrutores
	public ContaBanco() {
		
	}
	

	public ContaBanco(int numero, String tipo, double saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.saldo = saldo;
		this.cliente = cliente;
	}


	// M�todos
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	// M�todos de 
	public void setSaca(double valor) {
		this.saldo -= valor;
		ContaBanco.saldoDoBanco -= valor;
	}
	
	public void setDeposita(double valor) {
		this.saldo += valor;
		ContaBanco.saldoDoBanco += valor;
	}


	
	
}
