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
		// Pega o par�metro l�gica da requisi��o
		String parametro = req.getParameter("logica");
		
		// Monsta o nome da classe de l�gica que deve
		// ser executada
		String className = "br.senai.sp.informatica.empresadoschupinga.mvc.logica." + parametro;
		
		try {
			// Carrega a classe em mem�ria
			Class classe = Class.forName(className);
			
			// Cria uma inst�ncia da l�gica
			Logica logica = (Logica) classe.newInstance();
			
			// Cria a p�gina para redirecionar 
			String pagina = logica.executa(req, res);
			
			// Encaminhar o usu�rio
			req.getRequestDispatcher(pagina).forward(req, res);
		} catch (Exception e) {
			throw new ServletException("A l�gica de neg�cios causou uma exce��o", e);
		}
		
	}
	
}
