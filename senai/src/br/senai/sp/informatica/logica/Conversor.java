package br.senai.sp.informatica.logica;
import javax.swing.JOptionPane;

public class Conversor {
	public static void main(String[] args) {
		String unidade;
		String temp;
		double temperatura;
		int nova;
		do {
			unidade = JOptionPane.showInputDialog("Qual a unidade de medida ?");
			temp = JOptionPane.showInputDialog("Informe a temperatura ?");

			temperatura = Double.parseDouble(temp);

			double fahrenheit, celsius, kelvin;
			String msg;

			switch (unidade) {
			case "C":
			case "c":
				// converte de celsius para fahrenheit
				fahrenheit = (temperatura * 1.8) + 32;
				// converte de celsius para kelvin
				kelvin = temperatura + 273.15;
				msg = fahrenheit + "ºF\n" + kelvin + "ºK";
				JOptionPane.showMessageDialog(null, msg, "Resposta...", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "F":
			case "f":
				// converte de fahrenheit para celsius
				celsius = (temperatura - 32) / 1.8;
				// converte de fahrenheit para kelvin
				kelvin = (temperatura + 459.67) * 0.55555556;
				msg = celsius + "ºC\n" + kelvin + "ºK";
				JOptionPane.showMessageDialog(null, msg, "Resposta...", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "K":
			case "k":
				// converte de kelvin para celsius
				celsius = temperatura - 273.15;
				// converte de kelvin para fahrenheit
				fahrenheit = temperatura * 1.8 - 459.67;
				msg = celsius + "ºC\n" + fahrenheit + "ºF";
				JOptionPane.showMessageDialog(null, msg, "Resposta...", JOptionPane.INFORMATION_MESSAGE);
				break;

			}
			// nova = JOptionPane.showInputDialog("Deseja calcular novamente ?");
			nova = JOptionPane.showConfirmDialog(null, "Deseja calcular novamente ?", "Continuar",
					JOptionPane.YES_NO_OPTION);
			System.out.println(nova);
		} while (nova == 0);
	}
}
