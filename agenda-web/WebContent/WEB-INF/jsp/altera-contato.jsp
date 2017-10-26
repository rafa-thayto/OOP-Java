<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="senai" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Contatos</title>
<link href="css/jquery-ui.min.css" rel="stylesheet"/>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<c:import url="defaultimport.jsp"/>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	
	<form action="mvc?logica=EditaContatoLogica&id=${requestScope.id }" method="post">
		Nome <br /> 
		<input type="text" name="nome" value="${requestScope.nome }"/> <br /> 
		E-mail: <br />
		<input type="text" name="email" value="${requestScope.email }"/> <br /> 
		Endereço: <br /> 
		<input type="text" name="endereco" value="${requestScope.endereco }"/> <br /> 
		Data de Nascimento: <br /> 
		<senai:campoData id="dataNascimento" value="${requestScope.dataNascimento }" /> 
		<input type="submit" value="Salvar" />
	</form>
	<c:import url="rodape.jsp" />
</body>
</html>