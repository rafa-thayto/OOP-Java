package br.senai.sp.informatica.agenda.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.senai.sp.informatica.agenda.model.Contato;

public class ContatoDao {

	// Atributo
	private Connection connection;

	// Construtor
	public ContatoDao() {
		// Estabelece uma conexao com o banco de dados
		connection = new ConnectionFactory().getConnection();
	}

	// Salva
	public void salva(Contato contato) {
		// Cria um comando sql
		String sql = "INSERT INTO contato (nome, email, endereco, dataNascimento) " + "VALUES (?, ?, ?, ?)";
		try {

			// Cria um PreparedStatement
			PreparedStatement stmt = connection.prepareStatement(sql);

			// Cria os parâmetros do PreparedStatement
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());

			// Transforma o Calendar em date(cria um new Date()) e transfpr,a p tempo em
			// milis que é como o date funciona
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

			// Executa o insert
			stmt.execute();
			// Libera o recurso statement
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	// getLista
	public List<Contato> getLista() {

		try {
			// Cria um arrayList
			List<Contato> contatos = new ArrayList<>();

			// Cria um PreparedStatement
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM contato");

			// Executa o statement e guarda o resultado em um ResultSet
			ResultSet rs = stmt.executeQuery();

			// Enquanto houver dados no resultSet
			while (rs.next()) {
				// Cria um contato com os dados do resultSet
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// Obtém uma instancia de Calendar
				Calendar data = Calendar.getInstance();

				// Define a data do calendar com a data do banco de dados
				data.setTime(rs.getDate("dataNascimento"));

				// Define a data de nascimento do contato com o Calendar
				contato.setDataNascimento(data);

				// Adiciona o contato à lista de contatos
				contatos.add(contato);
			} // Fim do while

			// Fecha o ResultSet
			rs.close();

			// Fecha o statement
			stmt.close();

			// retorna a lista de contato
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

}
