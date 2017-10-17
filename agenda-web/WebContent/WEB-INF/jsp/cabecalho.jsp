<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<img src="./images/logo.jpg">

<h2>Bem-vindo - Sistema de Agenda</h2>

<p>
	Data: <%= new SimpleDateFormat("dd/MM/yyyy").format(new Date()) %>
</p>

<p>
	Hora: <%= new SimpleDateFormat("hh:mm:ss").format(new Date()) %>
</p>

<hr>