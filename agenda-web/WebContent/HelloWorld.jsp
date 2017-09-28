<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bem-vindo</title>
</head>
<body>
	<%-- comentário jsp --%>
	<!-- declada uma variável do tipo String -->
	<%String mensagem = "Bm-vindo a agenda !"; %>
	
	<!-- Imprime a mensagem no response -->
	<%= mensagem %> <br>
	
	<%-- exibe a data de hoje --%>
	<%=new SimpleDateFormat("dd/MM/yyyy").format(new Date()) %> <br>
	
	<%-- Exibe hora atual --%>
	<%=new SimpleDateFormat("hh:mm:ss").format(new Date()) %> <br>

	
	
</body>
</html>