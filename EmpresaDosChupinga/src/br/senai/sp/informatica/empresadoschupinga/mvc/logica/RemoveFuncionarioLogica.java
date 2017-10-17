package br.senai.sp.informatica.empresadoschupinga.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.empresadoschupinga.dao.FuncionarioDao;
import br.senai.sp.informatica.empresadoschupinga.model.Funcionario;

public class RemoveFuncionarioLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// Obtem o id pro meio de um parâmetro
		
		long id = Long.parseLong(req.getParameter("id"));
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId(id);
		
		FuncionarioDao dao = new FuncionarioDao();
		dao.excluir(funcionario);
		
		System.out.println("Excluindo o Funcionário...");
		
		// Após excluir o contato redireciona para a 
		// página de listar
		return "mvc?logica=ListaFuncionariosLogica";
		
	}

}
