<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Funcionários</title>
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
	<div class="row container">
			<form action="mvc?logica=SalvaFuncionarioLogica" method="post" class="col s12">
				<div class="row">
					<div class="input-field col s10">
						<input type="text" name="nome" id="inputNome" class="validate" autofocus>  
						<label class="active" for="inputNome">Nome</label> 
					</div>
				</div>
				<div class="row">
					<div class="input-field col s10">
						<input type="email" name="email" id="inputEmail" class="validate" data-error="wrong" data-success="right"> 
						<label class="active" for="inputEmail">E-mail</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s10"> 
						<input type="text" name="cpf" id="inputCpf" class="validate">
						<label class="active" for="inputCpf">Cpf</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s10"> 
						<input type="password" name="senha" id="inputSenha" class="validate"> 
						<label class="active" for="inputSenha">Senha</label> 
					</div>
				</div>
				
				<button type="submit" class="btn waves-effect waves-light white-text deep-purple darken-3" onclick="Materialize.toast('Cadastro concluÃ­do com sucesso!', 4000)">
					Enviar <i class="material-icons right">send</i>
				</button>
				<a class="btn waves-effect waves-light white-text deep-purple darken-3" href="index.html">
					Cancelar
				</a>
			</form>
		</div>
	
	<footer>
		<c:import url="rodape.jsp"></c:import>
	</footer>
	

</body>
</html>