package br.senai.sp.informatica.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		// Log
		System.out.println("Executando a lógica...");
		System.out.println("Retornando a página jsp...");
		return "primeira-logica.jsp";
	}

}
