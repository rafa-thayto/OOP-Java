package br.com.ozcorp;
/**
 * 
 * @author Rafael Thayto
 *
 */
public enum Sexo {
	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	OUTRO("Outro");
	
	private String nome;
	
	Sexo(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}
}
