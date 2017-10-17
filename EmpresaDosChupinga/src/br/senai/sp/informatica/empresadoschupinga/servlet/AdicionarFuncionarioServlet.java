package br.senai.sp.informatica.empresadoschupinga.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.empresadoschupinga.dao.FuncionarioDao;
import br.senai.sp.informatica.empresadoschupinga.model.Funcionario;

@WebServlet("/adicionarFuncionario")
public class AdicionarFuncionarioServlet extends HttpServlet {

	// Sobrescreve o método
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();
		try {

			String nome = req.getParameter("nome");
			String email = req.getParameter("email");
			String cpf = req.getParameter("cpf");
			String senha = req.getParameter("senha");

			Funcionario funcionario = new Funcionario();
			funcionario.setNome(nome);
			funcionario.setEmail(email);
			funcionario.setCpf(cpf);
			funcionario.setSenha(senha);

			// Instancia FuncionarioDao
			FuncionarioDao dao = new FuncionarioDao();

			// Salva o contato no banco de dados
			dao.salva(funcionario);

			// Feedback para user
			// Redireciona o usuário para a página de feedback
			RequestDispatcher dispatcher = req.getRequestDispatcher("/funcionario-adicionado.jsp");
			dispatcher.forward(req, res);
//			String html = "<html>" + "<head>" + "<meta charset=\"UTF-8\">" + "</head>" + "<body>"
//					+ "<h1>Funcionario cadastrado com sucesso !</h1>" + "</body>" + "</html>";
//			out.print(html);
		} catch (Exception e) {
			out.write(e.getMessage());
		}

	}
}
