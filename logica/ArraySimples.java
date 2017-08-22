import java.util.Arrays;
public class ArraySimples {
	public static void main(String[] args) {
		
		// declara um array de String
		String[] paises = {
			"Brasil", 
			"Russia", 
			"India", 
			"China"
			};
			
		// imprime um elemento do vetor
		System.out.println(paises[0]);
		System.out.println(paises[3]);
		
		// System.out.println(paises[10]);
		
		// exibe quantos elementos há no array
		System.out.println(paises.length);
		
		// exibe todos os elementos do array
		// java.util.Arrays
		System.out.println(Arrays.toString(paises));
		
		// pesquisa se há um elemento no array 
		// e retorna o seu indice
		int indice = Arrays.binarySearch(paises, "Russia");
		
		System.out.println("Indice: " + indice);
		
		System.out.println("Nome: " + paises[indice]);
		
		// ordena o array
		// Arrays.sort(array, int inicio, int fim);
		Arrays.sort(paises, 0, paises.length);
		
		// exibe todos os elementos do array
		System.out.println(Arrays.toString(paises));
		
		// declara um array de Double
		Double[] valores = {
			12.35,
			3456.3456,
			19.12
		};

		// acessa um elemento do array
		System.out.println(valores[0]);	
		
		/* declara um array do tipo inteiro
		 * para 5 elementos 
		 */
		 int[] impares = new int[5];
		 
		 // inicializa posicoes do array
		 impares[0] = 1;
		 impares[1] = 3;
		 impares[2] = 5;
		 impares[3] = 7;
		 impares[4] = 9;
		 // impares[5] = 11;
		 System.out.println(impares[3]);
	
	}
}