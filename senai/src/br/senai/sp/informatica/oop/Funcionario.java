package br.senai.sp.informatica.oop;

/**
 * 
 * @author Rafael Thayto
 *
 */
public class Funcionario {

	// Atributos
	private String nome;
	private double salario;
	private boolean ativo;
	private String senha;

	// Encapsulamento - métodos getters e setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
