package br.senai.sp.informatica.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.agenda.dao.ContatoDao;
import br.senai.sp.informatica.agenda.model.Contato;

public class RemoveContatoLogica implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// Obtem o id por meio de parâmetro
		// localhost:8080/agenda-web/RemoveContatoLogica/mvc?logica=RemoveContatoLogica&id=${contato.id}
		
		long id = Long.parseLong(req.getParameter("id"));
		
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDao dao = new ContatoDao();
		dao.excluir(contato);
		
		System.out.println("Excluindo o contato...");
		
		// Após excluir o contato redireciona para a página de listar
		return "mvc?logica=ListaContatosLogica"; 
	}
	
}
