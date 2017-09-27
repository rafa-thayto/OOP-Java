package br.senai.sp.informatica.empresadoschupinga.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.empresadoschupinga.dao.FuncionarioDao;
import br.senai.sp.informatica.empresadoschupinga.model.Funcionario;

@WebServlet("adicionarFuncinario")
public class AdicionarFuncionarioServlet extends HttpServlet{

	// Sobrescreve o método
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setEmail(email);
		funcionario.setSenha(senha);
		
		// Instancia FuncionarioDao
		FuncionarioDao dao = new FuncionarioDao();
		
		// Salva o contato no banco de dados
		dao.salva(funcionario);
		
		// Feedback para user
		String html = "<html>"
				+ "<head>"
				+ "<meta charset=\"UTF-8\">"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">"
				+ "</head>"
				+ "<body>"
				+ "<h1>Funcionário cadastrado com sucesso !</h1>"
				+ "</body>"
				+ "</html>";
		out.print(html);
		
		
		
		
		
	}
}
