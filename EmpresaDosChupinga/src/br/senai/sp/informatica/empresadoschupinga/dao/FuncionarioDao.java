package br.senai.sp.informatica.empresadoschupinga.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senai.sp.informatica.empresadoschupinga.model.Funcionario;

public class FuncionarioDao {

	// Atributo
	private Connection connection;

	// Construtor
	public FuncionarioDao() {
		// Estabelece uma conexao com o banco de dados
		connection = new ConnectionFactory().getConnection();
	}

	// Salva
	public void salva(br.senai.sp.informatica.empresadoschupinga.model.Funcionario funcionario) {
		// Cria um comando sql
		String sql = null;

		// Se o contato não tem um id
		if (funcionario.getId() != null) {
			// Faça um update
			sql = "UPDATE funcionario SET nome = ?, email = ?, cpf = ?, senha = ? WHERE id = ?";
		} else {
			// Faça um insert
			sql = "INSERT INTO funcionario (nome, email, cpf, senha) " + "VALUES (?, ?, ?, ?)";
		}
		
		try {

			// Cria um PreparedStatement
			PreparedStatement stmt = connection.prepareStatement(sql);

			// Cria os parâmetros do PreparedStatement
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.setString(3, funcionario.getCpf());
			stmt.setString(4, funcionario.getSenha());

			if (funcionario.getId() != null) {
				stmt.setLong(5, funcionario.getId());
			}
			
			// Executa o insert
			stmt.execute();
			// Libera o recurso statement
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	// getLista
	public List<Funcionario> getLista() {

		try {
			// Cria um arrayList
			List<Funcionario> funcionarios = new ArrayList<>();

			// Cria um PreparedStatement
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM funcionario");

			// Executa o statement e guarda o resultado em um ResultSet
			ResultSet rs = stmt.executeQuery();

			// Enquanto houver dados no resultSet
			while (rs.next()) {
				// Cria um contato com os dados do resultSet
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getLong("id"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setEmail(rs.getString("email"));
				funcionario.setCpf(rs.getString("cpf"));
				funcionario.setSenha(rs.getString("senha"));

				// Adiciona o contato à lista de contatos
				funcionarios.add(funcionario);
			} // Fim do while

			// Fecha o ResultSet
			rs.close();

			// Fecha o statement
			stmt.close();

			// retorna a lista de contato
			return funcionarios;
		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
	}

	public void excluir(Funcionario funcionario) {
		try {
			PreparedStatement stmt = connection.prepareStatement("DELETE FROM funcionario WHERE id = ?");
			stmt.setLong(1, funcionario.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
