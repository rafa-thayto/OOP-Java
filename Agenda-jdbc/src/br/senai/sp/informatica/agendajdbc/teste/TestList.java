package br.senai.sp.informatica.agendajdbc.teste;

import java.util.List;

import br.senai.sp.informatica.agendajdbc.dao.ContatoDao;
import br.senai.sp.informatica.agendajdbc.model.Contato;

public class TestList {

	public static void main(String[] args) {
		
		// Cria uma instância de ContatoDao
		// e abre uma conexao com o banco de dados
		ContatoDao dao = new ContatoDao();
		
		// recebe a lista de contatos dcadastyrados e armazena em um List
		List<Contato> contatos = dao.getLista();

		// Exibe os contatos
		for (Contato contato : contatos) {
			System.out.println("Nome " + contato.getNome());
			System.out.println("E-mail " + contato.getEmail());
			System.out.println("Endereço " + contato.getEndereco());
			System.out.println("Data de Nascimento " + contato.getDataNascimento().getTime() + "\n");
		}
	}

}
