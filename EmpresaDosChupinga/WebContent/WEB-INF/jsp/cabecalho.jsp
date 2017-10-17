<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<h2>Bem-vindo a Empresa dos Chupinga</h2>

<p>
	Data: <%= new SimpleDateFormat("dd/MM/yyyy").format(new Date()) %>
</p>

<p>
	Hora: <%= new SimpleDateFormat("hh:mm:ss").format(new Date()) %>
</p>

<hr>