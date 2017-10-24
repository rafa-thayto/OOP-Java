package br.senai.sp.informatica.agenda.mvc.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.agenda.dao.ContatoDao;
import br.senai.sp.informatica.agenda.model.Contato;

public class SalvaContatoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String endereco = req.getParameter("endereco");

		String dataEmTexto = req.getParameter("dataNascimento");

		Calendar dataNascimento = null;

		// converte a data de nascimento de String para Calendar
		try {
			// converte de String para Date
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);

			// Define a data do calendar
			// dataNascimento = new Calendar()
			dataNascimento = Calendar.getInstance();

			dataNascimento.setTime(date);

		} catch (ParseException e) {
			throw new RuntimeException(e);
		}

		// cria uma instância de contato com os dados
		// do formulário
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(dataNascimento);

		// cria uma instância de dao e abre uma
		// conexão com o banco de dados
		ContatoDao dao = new ContatoDao();

		// chama o método para salvar o contato
		dao.salva(contato);

		// feedback para o usuário
		return "/WEB-INF/jsp/contato-adicionado.jsp";
	}
}
