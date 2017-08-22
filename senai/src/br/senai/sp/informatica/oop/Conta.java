package br.senai.sp.informatica.oop;

/**
 * 
 * @author Rafael Thayto
 *
 */
public class Conta {
	
	// Atributos
	String cliente;
	double saldo;
	
	// M�todos
	
	/**
	 * Esse m�todo exibe o saldo do clinte
	 */
	void exibeSaldo() {
		System.out.println(this.cliente + " seu saldo � de R$ " + this.saldo);
	}
	
	/**
	 * Esse m�todo saca dinheiro da conta do cliente.
	 * @param valor valor para descrementar o saldo da conta do cliente.
	 */
	void saca(double valor ) {
		// saldo = saldo - valor;
		this.saldo -=valor;
	}
	
	/**
	 * Este m�todo deposita dinheiro na conta do cliente.
	 * O valor deve ser acrescentado ao saldo.
	 * @param valor valor para acrescentar ao saldo da conta do cliente.
	 */
	void deposita(double valor) {
		// saldo = saldo + valor;
		this.saldo += valor;
	}
	
	/**
	 * Este m�todo transfere dinheiro entre as contas.
	 * @param destino conta que deve receber o dinheiro.
	 * @param valor valor a ser transferido para a conta de destino
	 */
	void transferePara(Conta destino, double valor) {
		// Retira o valor do saldo da conta que chamou o m�todo
		this.saca(valor);
		// Deposita o valor na conta de destino
		destino.deposita(valor);
	}

}
