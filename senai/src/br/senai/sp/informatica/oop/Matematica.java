package br.senai.sp.informatica.oop;

/**
 * 
 * @author Rafael Thayto
 *
 */
public class Matematica {

	// Atributos
	
	// M�todos
	
	/**
	 * Este m�todo retorna o maior entre dois n�meros.
	 * @param um primeiro n�mero.
	 * @param dois segundo n�mero.
	 * @return o maior entre dois n�meros.
	 */
	int maior(int um, int dois) {
		if (um > dois) {
			return um;			
		} else {
			return dois;
		}
	}

	/**
	 * Esse m�todo recebe dois valores e
	 * retorna a soma deles.
	 * @param um primeiro valor.
	 * @param dois segundo valor.
	 * @return a soma de dois n�meros.
	 */
	double soma(double um, double dois) {
		return um + dois;
	}
	
	/**
	 * Esse m�todo � baseado na equa��o de Pell's
	 * utilizado para obter a raiz quadrada subtraindo n�meros
	 * �mpares.
	 * @param num valor inserido para realizar o c�lculo de ra�z.
	 * @return a ra�z quadrada.
	 */
	int raizPell(int num) {
		int iteracao = 0;
		int impar = 1;
		while (num >= impar) {
			
			if (num < impar) {
				break;
			} else {
				num -= impar;
				iteracao++;
				impar+=2;
			}
		}
		return iteracao;
		
	}
	
	double soma(double... numeros) {
		double total = 0;
		// Percorre o vetor de n�meros
		for (double numero : numeros) {
			// Soma o n�mero atual com o valor do total
			total += numero;
		}
		// Retorna o total do somat�rio
		return total;
	}
	
	double media(int x, int y) {
		System.out.println("media(int x, int y)");
		return (x + y) / 2;
	}
	
	double media(String x, String y) {
		System.out.println("media(String x, String y");	
		// Converte de String para int
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		
		return (ix + iy) / 2;
	}
	
	double media(double... numeros) {
		System.out.println("double... numeros");
		// Chama o m�todo soma(double... numeros) dessa classe
		return this.soma(numeros) / numeros.length;
	}
	
}
