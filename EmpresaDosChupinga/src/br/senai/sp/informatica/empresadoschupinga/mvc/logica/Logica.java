package br.senai.sp.informatica.empresadoschupinga.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {

	// M�todo que executa a l�gica
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception;
	
}
