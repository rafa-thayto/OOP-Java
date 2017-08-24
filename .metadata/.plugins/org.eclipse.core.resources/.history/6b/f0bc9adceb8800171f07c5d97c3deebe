package br.senai.sp.informatica.oop;

/**
 * 
 * @author Rafael Thayto
 *
 */
public class Matematica {

	// Atributos
	
	// Métodos
	
	/**
	 * Este método retorna o maior entre dois números.
	 * @param um primeiro número.
	 * @param dois segundo número.
	 * @return o maior entre dois números.
	 */
	int maior(int um, int dois) {
		if (um > dois) {
			return um;			
		} else {
			return dois;
		}
	}

	/**
	 * Esse método recebe dois valores e
	 * retorna a soma deles.
	 * @param um primeiro valor.
	 * @param dois segundo valor.
	 * @return a soma de dois números.
	 */
	double soma(double um, double dois) {
		return um + dois;
	}
	
	/**
	 * Esse método é baseado na equação de Pell's
	 * utilizado para obter a raiz quadrada subtraindo números
	 * ímpares.
	 * @param num valor inserido para realizar o cálculo de raíz.
	 * @return a raíz quadrada.
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
	
}
