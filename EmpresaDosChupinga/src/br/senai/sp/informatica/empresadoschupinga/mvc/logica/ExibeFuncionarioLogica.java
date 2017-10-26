package br.senai.sp.informatica.empresadoschupinga.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.empresadoschupinga.dao.FuncionarioDao;
import br.senai.sp.informatica.empresadoschupinga.model.Funcionario;

public class ExibeFuncionarioLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Funcionario funcionario = null;
		
		long id = Long.parseLong(req.getParameter("id"));
		
		// Obtém os funcionários na tabela 
		List<Funcionario> funcionarios = new FuncionarioDao().getLista();
		
		// Percorre a lista e tenta encontrar um id correspondente
		for (Funcionario f : funcionarios) {
			if (f.getId() == id) {
				funcionario = f;
				break;
			}
		}
		
		// define os atributos do funcionario
		req.setAttribute("id", funcionario.getId());
		req.setAttribute("nome", funcionario.getNome());
		req.setAttribute("email", funcionario.getEmail());
		req.setAttribute("cpf", funcionario.getCpf());
		req.setAttribute("senha", funcionario.getSenha());
		
		return "/WEB-INF/jsp/altera-funcionario.jsp";
	}

}
