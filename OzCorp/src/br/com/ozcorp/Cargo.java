package br.com.ozcorp;
/**
 * 
 * @author Rafael Thayto
 *
 */
public class Cargo {
	public String titulo;
	public double salarioBase;
	
	// Constructor
	public Cargo(String titulo, double salarioBase) {
		super();
		this.titulo = titulo;
		this.salarioBase = salarioBase;
	}

	// Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	
	
}
