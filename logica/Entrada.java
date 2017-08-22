// import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entrada {
	
	public static void main(String[] args) {
		
		// imprime o primeiro argumento
		// System.out.println(args[0]);
		// imprime o segundo argumento
		// System.out.println(args[1]);
		
		// dispositivo de entrada
		// Scanner teclado = new Scanner(System.in);
		// System.out.println("Qual é seu nome ?");
		// leia(nome)
		// String nome = teclado.nextLine();
		// System.out.println("Bem-vindo " + nome);
		
		// mostra um diálogo de entrada
		// e guarda o que o usuário digitar
		// na variável nome
		String nome = JOptionPane.showInputDialog("Qual o seu nome ?");
		
		// System.out.println(nome);
		
		// mostra um diálogo de mensagem
		// com uma mensagem de boas vindas
		JOptionPane.showMessageDialog(null, "Seja bem-vindo " + nome);
		
		
		
	}
}
