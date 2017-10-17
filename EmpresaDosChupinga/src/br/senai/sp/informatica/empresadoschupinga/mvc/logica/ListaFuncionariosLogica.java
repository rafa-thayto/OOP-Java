package br.senai.sp.informatica.empresadoschupinga.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.empresadoschupinga.dao.FuncionarioDao;
import br.senai.sp.informatica.empresadoschupinga.model.Funcionario;

public class ListaFuncionariosLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		List<Funcionario> funcionarios = new FuncionarioDao().getLista();
		
		req.setAttribute("funcionarios", funcionarios);
		
		return "/WEB-INF/jsp/lista-funcionarios.jsp";
		
	}

}
