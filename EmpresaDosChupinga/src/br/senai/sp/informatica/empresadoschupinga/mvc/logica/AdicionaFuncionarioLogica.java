package br.senai.sp.informatica.empresadoschupinga.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdicionaFuncionarioLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return "/WEB-INF/jsp/adiciona-funcionario.jsp";
	}

}
