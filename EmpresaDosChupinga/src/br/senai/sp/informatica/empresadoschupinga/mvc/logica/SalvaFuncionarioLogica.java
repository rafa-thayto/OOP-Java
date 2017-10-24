package br.senai.sp.informatica.empresadoschupinga.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.empresadoschupinga.dao.FuncionarioDao;
import br.senai.sp.informatica.empresadoschupinga.model.Funcionario;

public class SalvaFuncionarioLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String cpf = req.getParameter("cpf");
		String senha = req.getParameter("senha");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setEmail(email);
		funcionario.setCpf(cpf);
		funcionario.setSenha(senha);
		
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.salva(funcionario);
		
		return "/WEB-INF/jsp/funcionario-adicionado.jsp";
	}

}
