<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Funcion�rios</title>
<link href="css/jquery-ui.min.css" rel="stylesheet">
<c:import url="default-import.jsp"/>
</head>
<body>

	<header>
		<!-- Navbar -->
		<nav class="deep-purple darken-3">
				<div class="nav-wrapper">
					<a href="index.html" class="brand-logo center"><i class="material-icons">euro_symbol</i>Cadastro de Chupingas</a>
				</div>
			</nav>
		<c:import url="cabecalho.jsp"></c:import>
	</header>

	<form action="mvc?logica=SalvaFuncionarioLogica" method="post">
		<label for="nome">Nome:</label> <br>
		<input type="text" name="nome" id="nome"> <br>
		<label for="email">Email:</label> <br>
		<input type="email" name="email" id="email"> <br>
		<label for="cpf">Cpf:</label> <br>
		<input type="text" name="cpf" id="cpf"> <br>
		<label for="senha">Senha:</label> <br>
		<input type="password" name="senha" id="senha" > <br>
		
		<button type="submit" class="btn waves-effect waves-light white-text deep-purple darken-3" onclick="Materialize.toast('Clicou forte de mais!', 4000)">
			Enviar
		</button>
		<a class="btn waves-effect waves-light white-text deep-purple darken-3" href="index.html">
			Cancelar
		</a>
	</form>
	
	<footer>
		<c:import url="rodape.jsp"></c:import>
	</footer>
	

</body>
</html>