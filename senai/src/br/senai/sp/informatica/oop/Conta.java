package br.senai.sp.informatica.oop;

/**
 * 
 * @author Rafael Thayto
 *
 */
public class Conta {
	
	// Atributos
	private String cliente;
	private double saldo;
	public static double saldoDoBanco;
	
	public Conta() {
		
	}
	
	public Conta(String cliente, double saldo) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	// Métodos

	/**
	 * Esse método exibe o saldo do clinte
	 */
	void exibeSaldo() {
		System.out.println(this.cliente + " seu saldo é de R$ " + this.saldo);
	}
	
	/**
	 * Esse método saca dinheiro da conta do cliente.
	 * @param valor valor para descrementar o saldo da conta do cliente.
	 */
	void saca(double valor ) {
		// saldo = saldo - valor;
		this.saldo -=valor;
		Conta.saldoDoBanco -= valor;
	}
	
	/**
	 * Este método deposita dinheiro na conta do cliente.
	 * O valor deve ser acrescentado ao saldo.
	 * @param valor valor para acrescentar ao saldo da conta do cliente.
	 */
	void deposita(double valor) {
		// saldo = saldo + valor;
		this.saldo += valor;
		Conta.saldoDoBanco += valor;
	}
	
	/**
	 * Este método transfere dinheiro entre as contas.
	 * @param destino conta que deve receber o dinheiro.
	 * @param valor valor a ser transferido para a conta de destino
	 */
	void transferePara(Conta destino, double valor) {
		// Retira o valor do saldo da conta que chamou o método
		this.saca(valor);
		// Deposita o valor na conta de destino
		destino.deposita(valor);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;			
		} else {
			System.err.println("Saldo inválido");
		}
	}
	

}
