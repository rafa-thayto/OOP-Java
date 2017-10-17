package br.senai.sp.informatica.empresadoschupinga.mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.empresadoschupinga.mvc.logica.Logica;

@WebServlet("/mvc")
public class ServletController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// Pega o parâmetro lógica da requisição
		String parametro = req.getParameter("logica");
		
		// Monsta o nome da classe de lógica que deve
		// ser executada
		String className = "br.senai.sp.informatica.empresadoschupinga.mvc.logica." + parametro;
		
		try {
			// Carrega a classe em memória
			Class classe = Class.forName(className);
			
			// Cria uma instância da lógica
			Logica logica = (Logica) classe.newInstance();
			
			// Cria a página para redirecionar 
			String pagina = logica.executa(req, res);
			
			// Encaminhar o usuário
			req.getRequestDispatcher(pagina).forward(req, res);
		} catch (Exception e) {
			throw new ServletException("A lógica de negócios causou uma exceção", e);
		}
		
	}
	
}
