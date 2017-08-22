package br.senai.sp.informatica.logica;
/** 
* ImcPrototipo
* Calcula o imc de uma pessoa indicando se 
* esta pessoa está dentro ou fora do peso ideal.
* Uma pessoa está dentro do peso ideal quando
* seu imc está entre 20 e 25.
* Fórmula: imc = peso / altura2
* @Author Jorge Rabello
*/
public class ImcPrototipo {
	public static void main(String[] args) {
		
		// peso
		double pesoEmKg = 70;
		
		// altura
		double altura = 1.70;
		
		// calcula o imc
		double imc = pesoEmKg / Math.pow(altura, 2);
		
		System.out.println("IMC: " + imc);
		
		// diagnóstico
		String diagnostico = imc >= 20 && imc <= 25 ? "Dentro do peso ideal." : "Fora do peso ideal.";
		
		System.out.println("DIAGNOSTICO: " + diagnostico);
		
	}
}