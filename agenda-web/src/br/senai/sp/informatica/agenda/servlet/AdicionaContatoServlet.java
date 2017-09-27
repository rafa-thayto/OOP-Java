package br.senai.sp.informatica.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.senai.sp.informatica.agenda.dao.ContatoDao;
import br.senai.sp.informatica.agenda.model.Contato;

@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet{

	// sobrescreve o m�todo
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
			// Obtem um objeto do tipo PrintWriter do response
			// �til para escrever mensagens no navegador do usu�rio
			PrintWriter out = res.getWriter();
			
			// Pega os par�metros do formul�rio (request)
			String nome = req.getParameter("nome");
			String email = req.getParameter("email");
			String endereco = req.getParameter("endereco");
			String dataEmTexto = req.getParameter("dataNascimento");
			
			Calendar dataNascimento = null;
			
			try {
				// Cria um objeto do tipo date e converte a data
				// de String para date
				Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
				
				// Obt�m uma inst�ncia de Calendar
				dataNascimento = Calendar.getInstance();
				
				// Define a data do Calendar com a data do formul�rio
				dataNascimento.setTime(data);
				
			} catch (ParseException e) {
				out.println("Erro de convers�o de data !");
				return; // interrompe o m�todo service imediatamente
			}
			
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setEmail(email);
			contato.setEndereco(endereco);
			contato.setDataNascimento(dataNascimento);
			
			// Obt�m uma inst�ncia de ContadoDao
			// e abre uma conex�o com o banco de dados
			ContatoDao dao = new ContatoDao();
			
			// salva o contato no banco de dados
			dao.salva(contato);
			
			// feedback p�ra o usu�rio
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset=\"UTF=8\">");			
			out.println("</head>");
			out.println("<body>");
			out.println("Contato " + contato.getNome() + " salvo com sucesso!");
			out.println("</body>");
			out.println("</html>");
			
	}
}
