package br.com.ozcorp;
/**
 * 
 * @author Rafael Thayto
 *
 */
public enum TipoSanguineo {
	A_POSITIVO("A+"),
	A_NEGATIVO("A-"),
	B_POSITIVO("B+"),
	B_NEGATIVO("B-"),
	AB_POSITIVO("AB+"),
	AB_NEGATIVO("AB-"),
	O_POSITIVO("O+"),
	O_NEGATIVO("O-");
	
	private String tipo;
	
	TipoSanguineo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return tipo;
	}
	
	
	
}
