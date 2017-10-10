package br.senai.sp.informatica.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {

	// Método que executa a lógica
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception;
	
}
