package br.com.senai.sp.informatica.algoritmo.string;

public class MetodosStringDoSenai {

//	charAt
	public static char caractereNa(String texto, int posicao) {
		// Converte a String em vetor de caracteres
		char[] letrasDoTexto = texto.toCharArray();
		
		// retorna a letra em determinado indice
		return letrasDoTexto[posicao];
		
	}
	
//	indiceDe
	public static int indiceDe(String texto, String procurado) {
		// Transforme em vetor
		char[] letrasTexto = texto.toCharArray();
		char[] letrasProcurado = procurado.toCharArray();
		int contOcorrencias = 0;
		
		// Primeiro laço: Percorre o texto base
		for (int i = 0; i < letrasTexto.length; i++) {
			
			// Segundo laço: Percorre o procurado
			for (int j = 0; j < letrasProcurado.length; j++) {
				
				// Verificando se a letra for igual
				if (letrasProcurado[j] == letrasTexto[i]) {
					++i; // Avanca para o próximo numero
					contOcorrencias++;
				} else {
					contOcorrencias = 0;
					break;
				}
			}
			// Verifica se encontroy todas as ocorrências 
			if (contOcorrencias == letrasProcurado.length) {
				return i - contOcorrencias;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
//		System.out.println("Caractere: " +
//				caractereNa("Rafael Thayto", 8));
		System.out.println("Indice de: " + 
				indiceDe("pao-de-mel", "mel"));
		
	}
	
}
