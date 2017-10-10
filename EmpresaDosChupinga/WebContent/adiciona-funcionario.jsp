<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib tagdir="/WEB-INF/tags" prefix="senai" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empresa - Cadastro de Funcionários</title>
<link href="css/jquery-ui.min.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
</head>
<body>

	<header>
		<c:import url="cabecalho.jsp"></c:import>
	</header>

	<form action="adicionarFuncionario" method="post">
		<label for="nome">Nome:</label> <br>
		<input type="text" name="nome" id="nome"> <br>
		<label for="email">Email:</label> <br>
		<input type="email" name="email" id="email"> <br>
		<label for="cpf">Cpf:</label> <br>
		<input type="text" name="cpf" id="cpf"> <br>
		<label for="senha">Senha:</label> <br>
		<input type="password" name="senha" id="senha" > <br>
		
		<input type="submit" value="enviar">
	</form>
	
	<footer>
		<c:import url="rodape.jsp"></c:import>
	</footer>
	

</body>
</html>