package br.senai.sp.informatica.logica;
import javax.swing.JOptionPane;

/**
 * 
 * @author Jorge Rabello
 *
 */
public class OlaEclipse {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual seu nome ?");

		JOptionPane.showMessageDialog(null, "Ola " + nome);

	}

}
