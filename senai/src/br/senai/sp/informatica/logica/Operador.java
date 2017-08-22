package br.senai.sp.informatica.logica;
public class Operador {
	
	public static void main(String[] args) {
		
		// operador binário
		int x = 9 + 4;
		System.out.println(x);
		
		String y = "9" + "4";
		System.out.println(y);
		
		double z = 5 + 3 / 2;
		System.out.println(z); // 6
		
		double a = (5 + 3) / 2;
		System.out.println(a); // 4
		
		double b = 7 - 4 + 3 * 2; // 9
		System.out.println(b);
		
		double c = (7 - 4 + 3) * 2; // 12
		System.out.println(c);
		
		// operadores matemáticos
		double soma = 7 + 3; // 10
		System.out.println(soma);
		
		double modulo = 3 % 2; // 1
		System.out.println(modulo);
		
		double divisao = 10 / 2;
		System.out.println(divisao);
		
		double positivo = +3;
		System.out.println(positivo);
		
		double negativo = -3;
		System.out.println(negativo);
		
		double meuNum = -(+3);
		System.out.println(meuNum);
		
		double outroNum = -(-3);
		System.out.println(outroNum);
		
		int meuInt = 6;
		// soma + 1 em meu int e mostra na tela
		// meuInt = meuInt + 1;
		int outroInt = meuInt;
		
		// pós incremento
		/* aqui somente veremos as alterações
		 * na linha 54 (na linha de baixo 
		 */
		 // outroInt = 6
		System.out.println(outroInt++); //6
		System.out.println(outroInt); // 7
		
		// pré incremento
		/* aqui veremos as alterações
		 * na mesma linha */
		 // outroInt = 7
		System.out.println(++outroInt); // 8
		
		// operadores de comparação
		int numero = 6;
		System.out.println(numero == 6); // true
		
		String numeroTxt = "6";
		System.out.println(numeroTxt == "6"); // true
		
		System.out.println(numero != 6); // false
		System.out.println(numero != 7); // true
		System.out.println(numero > 7); // false
		System.out.println(numero > 5); // true
		
		System.out.println(numero >= 5); // true
		System.out.println(numero >= 6); // true
		
		Integer bianca = 8;
		// verifica se a variável bianca
		// é do tipo Integer
		System.out.println(bianca instanceof Integer); // true
		
		System.out.println("oi" instanceof String);
		
		Integer sete = 7;
		System.out.println(sete instanceof Integer);
		
		// operadores lógicos
		Integer seis = 6;
		// operador e
		System.out.println((seis >= 1) && (seis <= 10));// true
		
		// operador ou
		System.out.println((seis >= 1) || (seis <= 5)); 
		
		// operador não
		System.out.println((seis > 1)); // true
		System.out.println(!(seis > 1)); // false
		
		
		// operadores de atribuição
		int xpto = 6;
		// soma + 3 em xpto
		// xpto = xpto + 3;
		xpto += 3;
		System.out.println(xpto);
		
		// subtrai 3 em xpto
		//xpto = xpto - 3;
		xpto -= 3;
		System.out.println(xpto);
		
		// multiplica xpto por 3
		// xpto = xpto * 3;
		xpto *= 3;
		System.out.println(xpto);
		
		// divide xpto por 2
		// xpto = xpto / 2;
		xpto /= 2;
		System.out.println(xpto);
		
		// resto da divisao de xpto por 2
		// xpto = xpto % 2;
		xpto %= 2;
		System.out.println(xpto);
		
		// operadoradores especiais
		// operador ternário
		int idade = 89;
		String classe = idade >= 18 ? "Maior de Idade" : "Menor de Idade";
		System.out.println(classe);
		
	}
}