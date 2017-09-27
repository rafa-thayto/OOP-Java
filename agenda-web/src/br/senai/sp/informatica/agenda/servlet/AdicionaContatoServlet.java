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

	// sobrescreve o método
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
			// Obtem um objeto do tipo PrintWriter do response
			// Útil para escrever mensagens no navegador do usuário
			PrintWriter out = res.getWriter();
			
			// Pega os parâmetros do formulário (request)
			String nome = req.getParameter("nome");
			String email = req.getParameter("email");
			String endereco = req.getParameter("endereco");
			String dataEmTexto = req.getParameter("dataNascimento");
			
			Calendar dataNascimento = null;
			
			try {
				// Cria um objeto do tipo date e converte a data
				// de String para date
				Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
				
				// Obtém uma instância de Calendar
				dataNascimento = Calendar.getInstance();
				
				// Define a data do Calendar com a data do formulário
				dataNascimento.setTime(data);
				
			} catch (ParseException e) {
				out.println("Erro de conversão de data !");
				return; // interrompe o método service imediatamente
			}
			
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setEmail(email);
			contato.setEndereco(endereco);
			contato.setDataNascimento(dataNascimento);
			
			// Obtém uma instância de ContadoDao
			// e abre uma conexão com o banco de dados
			ContatoDao dao = new ContatoDao();
			
			// salva o contato no banco de dados
			dao.salva(contato);
			
			// feedback pára o usuário
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
