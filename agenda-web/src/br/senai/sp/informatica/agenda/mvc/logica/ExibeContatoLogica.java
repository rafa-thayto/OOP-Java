package br.senai.sp.informatica.agenda.mvc.logica;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.agenda.dao.ContatoDao;
import br.senai.sp.informatica.agenda.model.Contato;

public class ExibeContatoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		Contato contato = null;

		long id = Long.parseLong(req.getParameter("id"));
		
		// obtém todos os contatos da tabela
		List<Contato> contatos = new ContatoDao().getLista();
		
		// percorre a lista e tenta encontrar um id
		// correspondente
		for (Contato c : contatos) {
			if (c.getId() == id) {
				contato = c;
				break;
			}
		}
		
		// define os atributos do contato
		req.setAttribute("id", contato.getId());
		req.setAttribute("nome", contato.getNome());
		req.setAttribute("endereco", contato.getEndereco());
		req.setAttribute("email", contato.getEmail());
		
		// converte o formato da data para pt-BR
		String dataBr = new SimpleDateFormat("dd/MM/yyyy").format(contato.getDataNascimento().getTime());
		req.setAttribute("dataNascimento", dataBr);
		
		// exibe o formulário com os dados do contato
		return "/WEB-INF/jsp/altera-contato.jsp";
		
	}

}
