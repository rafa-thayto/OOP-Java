import javax.swing.JOptionPane;
/**
* ImcRelease
* Programa que calcula o imc de uma pessoa indicando
* se a pessoa está dentro ou fora do peso ideal.
* Uma pessoa está dentro do peso ideal quando seu
* imc está entre 20 e 25.
* Fórmula: imc = peso / altura2
* @Author Jorge Rabello
*/
public class ImcRelease {
	public static void main(String[] args) {
		
		// peso
		String peso = JOptionPane.showInputDialog(null, "Qual seu peso em Kilogramas ?", "Peso", JOptionPane.QUESTION_MESSAGE);
		
		// converte de String para double
		double pesoEmKg = Double.parseDouble(peso);
		
		// altura
		String altura = JOptionPane.showInputDialog(null, "Qual a sua altura em metros ?", "Altura", JOptionPane.QUESTION_MESSAGE);
		double alturaEmMetros = Double.parseDouble(altura);
		
		// calcula o imc
		double imc = pesoEmKg / Math.pow(alturaEmMetros, 2);
		
		// diagnostico
		String diagnostico = imc >= 20 && imc <= 25 ? "Dentro do peso ideal" : "Fora do peso ideal";
		
		String msg = "IMC: " + imc + "\n" + diagnostico;
		
		// exibe o diagnostico
		JOptionPane.showMessageDialog(null, msg, "Diagnostico", JOptionPane.INFORMATION_MESSAGE);
		
	}
}