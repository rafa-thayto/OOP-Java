package br.com.senai.sp.informatica.algoritmo.string;

public class MetodosStringJava {

	public static void main(String[] args) {

		String senai = "ESCOLA Senai de Inform�tica";
		String nomeDesformatado = "                 RaFinHa                     TitLe                      ";
		
		
		// charAt(int) - Retorna um caractere de uma dada posi��o
//		char letra = senai.charAt(7);
//		System.out.println("charAt: " + letra);			
		
		// equals(String) - Compara duas Strings
//		System.out.println("equals: " + senai.equals("Escola Senai de Inform�tica"));
		
		// equalsIgnoreCase(String) - Compara duas strings ingnorando caixas
//		System.out.println("equalsIgnoreCase: "+ senai.equalsIgnoreCase("ESCOLA SENAI DE INFORM�TICA"));
		
		// containg(String) - Verifica se um subtexto existe no texto
//		System.out.println("contains: " + senai.contains("Inform�tica"));
		
		// indexOf(String) - Retorna o indice onde se encontra um subtexto
//		System.out.println("indexOf: " + senai.indexOf("Senai"));
		
		// replace(String, String) - Troca um subtexto por outro
//		System.out.println("replace: " + senai.replace("Inform�tica", "Mec�nica"));
		
		// substring(int) - retorna um subtexto atrav�s do �ndice inicial
//		System.out.println("substring: " + senai.substring(12));
		
		//substring(int, int) - Retorna um subtexto atrav�s do �ndice
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
		
		// trim -Elimina caracteres n�o vis�veis do in�cio e do final da String 
		System.out.println("trim: " + nomeDesformatado.trim());
		
	}

}
