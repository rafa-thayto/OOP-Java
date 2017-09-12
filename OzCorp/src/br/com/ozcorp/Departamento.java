package br.com.ozcorp;
/**
 * 
 * @author Rafael Thayto
 *
 */
public class Departamento {
	public String nome;
	public String sigla;
	public Cargo cargo;
	
	// Contructor
	public Departamento(String nome, String sigla, Cargo cargo) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.cargo = cargo;
	}

	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
	
	
}
