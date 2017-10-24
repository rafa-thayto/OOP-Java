package br.senai.sp.informatica.agenda.mvc.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.agenda.dao.ContatoDao;
import br.senai.sp.informatica.agenda.model.Contato;

public class EditaContatoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		// Recupera o id da sess�o e converte de string para long
		long id = Long.parseLong(req.getParameter("id"));
		
		// Recupera osw dados do contato da sess�o
		String nome = req.getParameter("nome");
		String endereco = req.getParameter("endereco");
		String email = req.getParameter("email");
		String dataEmTexto = req.getParameter("dataNascimento");
		
		// Converte a data de String para Calendar
		Calendar dataNascimento = null;
		try {
			// Transforma a data de String para date
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			// Obt�m uma inst�ncia de Calendar
			dataNascimento = Calendar.getInstance();
			// Defube a data di cakebd�rio utilizando o date
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// Obt�m um inst�ncia de contato
		Contato contato = new Contato();
		// inicializar os atributos do contato com os
		// atributos da sess�o
		contato.setId(id);
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(dataNascimento);
		
		// Obt�m um inst�ncia de ContatoDao
		ContatoDao dao = new ContatoDao();
		// Salva o contato no banco de dados
		dao.salva(contato);
		// feedback para o usu�rio
		return "mvc?logica=ListaContatosLogica";
	}
	
	
}
