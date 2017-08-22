package br.senai.sp.informatica.logica;
public class Selecao {
	public static void main(String[] args) {
		
		char sexo = 'm';
		
		switch (sexo) {
			case 'M':
			case 'm':
				System.out.println("Masculino");
				break;
			case 'F':
			case 'f':
				System.out.println("Feminino");
				break;
			default:
				System.out.println("Outro");

		}
		
		String tecnologia = "mysql";
		switch (tecnologia) {
			case "java":
			case "c++":
			case "cobol":
				System.out.println("Linguagem de Programacao");
				break;
			case "oracle":
			case "mysql":
			case "postgree":
				System.out.println("Banco de Dados");
				break;
			default:
				System.out.println("Tecnologia desconhecida");
		}
		
	}
}