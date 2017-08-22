package br.senai.sp.informatica.logica;
public class Variavel {

	public static void main(String[] args) {
		
		// tipos primitivos
		char sexo = 'M'; // unicode
		double preco = 12.45;
		boolean casado = true;
		int idade = 29;
		
		byte b = 127; // cem
		
		short s = 32767; // 32 mil
		
		int i = 2_000_000_000; // 2 bilhões
		
		long l = 9_000_000_000_000_000_000L; // 9 quintilhões
		
		double d = 1.7976931348623157E+308D; // IEEE 754
		
		float f = 12.78F;
		
		// 0b = prefixo para binário
		// 8 bits (1 Byte) 
		byte bb = 0b01010101; // 127 
		
		// 16 bits ou 2 Bytes
		short ss = 0b0101010101010101; 
		
		// 32 bits ou 4 Bytes
		int ii = 0b01010101010101010101010101010101;
		
		// cast implícito
		int meuInt = 32;
		short meuShort = 80;
		meuInt = meuShort;
		// System.out.println(meuInt);
		
		// cast explícito
		int meuInt2 = 32;
		long meuLong = 2_000_000_000;
		meuInt2 = (int) meuLong;
		// System.out.println(meuInt2);
		
		// CLASSES WRAPER
		Double preco2 = new Double("12.45");
		System.out.println(preco2);
		/* converte Double em seu tipo 
		* primitivo correspondente
		*/
		double v = preco2.doubleValue();
		
		// converte preco2 de Double para int
		int valorInt = preco2.intValue();
		System.out.println(valorInt);
		
		// converte preco2 de Double para byte
		byte precoByte = preco2.byteValue();
		System.out.println(precoByte);
		
		Boolean casado2 = new Boolean("true");
		System.out.println(casado2);
		
		// converter uma String para double
		// conversão estática
		double myDouble = Double.parseDouble("123.45");
		int myInt = Integer.parseInt("123");
		String texto = "3.14F";
		float myFloat = Float.parseFloat(texto);
		System.out.println(myFloat + 2);
		int outroInt = Integer.valueOf("101011");
		System.out.println(outroInt);
		int outroInt2 = Integer.valueOf("101011", 2);
		System.out.println(outroInt2);
	}
}