package br.senai.sp.informatica.oop;

public class Produto {

	private String barCode;
	private String descicao;
	private double preco;
	private String categoria;
	private boolean perecivel;

	public Produto(String barCode, String descicao, double preco, String categoria, boolean perecivel) {
		super();
		setBarCode(barCode);
		setDescicao(descicao);
		setPreco(preco);
		setCategoria(categoria);
		setPerecivel(perecivel);
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		if (barCode.length()<10) {
			System.err.println("Menos de 10 valores inseridos!");
		} else {
			this.barCode = barCode;
		}
	}

	public String getDescicao() {
		return descicao;
	}

	public void setDescicao(String descicao) {
		if (descicao.length() < 5) {
			System.err.println("Menos de 5 letras inseridas!");
		} else {
			this.descicao = descicao;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			System.err.println("Valor menor que 0 ou negativo n�o pode ser inserido!");
		} else {
			this.preco = preco;
		}
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if (categoria.length() < 5) {
			System.err.println("Menos de 5 letras inseridas!");
		} else {
			this.categoria = categoria;
		}
	}

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}

	public void getProduto() {

		System.out.println("Codigo de barras: " + this.barCode);
		System.out.println("Descricao: " + this.descicao);
		System.out.println("Preco: " + this.preco);
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Perecivel: " + this.perecivel);
		
	}
	
}
