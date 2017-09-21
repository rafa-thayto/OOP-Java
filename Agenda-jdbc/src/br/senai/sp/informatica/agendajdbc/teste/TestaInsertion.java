package br.senai.sp.informatica.agendajdbc.teste;

import java.util.Calendar;

import br.senai.sp.informatica.agendajdbc.dao.ContatoDao;
import br.senai.sp.informatica.agendajdbc.model.Contato;

public class TestaInsertion {

	public static void main(String[] args) {

		// Cria um Contato
		Contato contato = new Contato();
		contato.setNome("Front-end");
		contato.setEmail("javascript@html.css");
		contato.setEndereco("No seu Coração / Browser");
		// Calendar.getInstance() = data de hoje !
		contato.setDataNascimento(Calendar.getInstance());

		// Cria uma instancia de ContatoDao
		// abre uma conexão com o banco de dados
		ContatoDao dao = new ContatoDao();
		dao.salva(contato);
		System.out.println("Salvo !");
	}

}
