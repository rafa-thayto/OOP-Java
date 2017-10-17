<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib tagdir="/WEB-INF/tags" prefix="senai" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda - Cadastro de Contato</title>
<link href="css/jquery-ui.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
</head>
<body>
	<header>		
		<c:import url="cabecalho.jsp"></c:import>
	</header>
	<form action="adicionaContato" method="post">
		Nome: <br>
		<input type="text" name="nome"> <br> 
		E-mail: <br>
		<input type="text" name="email"> <br> 
		Endere�o: <br>
		<input type="text" name="endereco"> <br> 
		Data de Nascimento: <br>
		<senai:campData id="dataNascimento" />
		
		<input type="submit" value="Salvar">
	</form>
	<footer>		
		<c:import url="rodape.jsp"></c:import>
	</footer>
	
</body>
</html>