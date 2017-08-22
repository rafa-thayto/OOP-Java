import java.util.Random;
import javax.swing.JOptionPane;
/**
* NumberGame2 
* Lança um dado (sorteia um número entre 
* 1 e 6) e verifica se o usuário adivinhou
* o número sorteado.
* @Author Jorge Rabello
*/
public class NumberGame2 {
	public static void main(String[] args) {
		
		Random random = new Random();
		
		/* 
		 * sorteia um número entre 0 e 5
		 * se sortear 0 + 1 = 1
		 * se sortear 5 + 1 = 6 
		 */
		int dado = random.nextInt(6) + 1;
		
		/* 
		 * o modo trapaça exibe o resultado 
		 * do número sorteado. 
		 * o valor padrão é false
		 */
		boolean modoTrapaca = false;
		
		if (modoTrapaca) {
			System.out.println(dado);
		}
		
		// palpite
		String palpite = JOptionPane.showInputDialog(null, "Informe seu palpite", "Palpite...", JOptionPane.QUESTION_MESSAGE);
		// converte String para int
		int palpiteInt = Integer.parseInt(palpite);
		
		/* se o usuário digitar um número negativo 
		 * ou um número maior que 6 exibe um diálogo
		 * solicitando que digite um número entre 
		 * 1 e 6
		 */
		if(palpiteInt < 1 || palpiteInt > 6) {
			JOptionPane.showMessageDialog(null, "Digite um numero entre 1 e 6", "Erro...", JOptionPane.WARNING_MESSAGE);
		}
		
		// verifica se o usuário acertou ou errou
		if (dado == palpiteInt) {
			JOptionPane.showMessageDialog(null, "Acertou", "Resultado...", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Errou", "Resultado...", JOptionPane.ERROR_MESSAGE);
		}	
	}
}