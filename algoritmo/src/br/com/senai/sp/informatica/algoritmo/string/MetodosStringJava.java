package br.com.senai.sp.informatica.algoritmo.string;

public class MetodosStringJava {

	public static void main(String[] args) {

		String senai = "ESCOLA Senai de Informática";
		String nomeDesformatado = "                 RaFinHa                     TitLe                      ";
		
		
		// charAt(int) - Retorna um caractere de uma dada posição
//		char letra = senai.charAt(7);
//		System.out.println("charAt: " + letra);			
		
		// equals(String) - Compara duas Strings
//		System.out.println("equals: " + senai.equals("Escola Senai de Informática"));
		
		// equalsIgnoreCase(String) - Compara duas strings ingnorando caixas
//		System.out.println("equalsIgnoreCase: "+ senai.equalsIgnoreCase("ESCOLA SENAI DE INFORMÁTICA"));
		
		// containg(String) - Verifica se um subtexto existe no texto
//		System.out.println("contains: " + senai.contains("Informática"));
		
		// indexOf(String) - Retorna o indice onde se encontra um subtexto
//		System.out.println("indexOf: " + senai.indexOf("Senai"));
		
		// replace(String, String) - Troca um subtexto por outro
//		System.out.println("replace: " + senai.replace("Informática", "Mecânica"));
		
		// substring(int) - retorna um subtexto através do índice inicial
//		System.out.println("substring: " + senai.substring(12));
		
		//substring(int, int) - Retorna um subtexto através do índice
		// inicial e final
//		System.out.println("substring 2: " + senai.substring(7,12));
		
		// toUpperCase - Texto em caixa alta 
//		System.out.println("toUpperCase: " + nomeDesformatado.toUpperCase());
		
		// toLowerCase - Texto em caixa baixa
//		System.out.println("toLowerCase: " + nomeDesformatado.toLowerCase());
		
		// Mudando a String 
//		nomeDesformatado = nomeDesformatado.toLowerCase().trim();
		
		while (nomeDesformatado.contains("  ")) {
			nomeDesformatado = nomeDesformatado.replace("  ", " ");
		}
		System.out.println(nomeDesformatado);
		
		// trim -Elimina caracteres não visíveis do início e do final da String 
		System.out.println("trim: " + nomeDesformatado.trim());
		
	}

}
