<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Funcionarios</title>
<c:import url="default-import.jsp"/>
</head>
<body>
	<header>
		<!-- Navbar -->
		<nav class="deep-purple darken-3">
				<div class="nav-wrapper">
					<a href="index.html" class="brand-logo center"><i class="material-icons">euro_symbol</i>Editor de Chupingas</a>
				</div>
			</nav>
		<c:import url="cabecalho.jsp"></c:import>
	</header>
	<main>
		
		<div class="row container">
			<form action="mvc?logica=EditaFuncionarioLogica&id=${ requestScope.id }" method="post" class="col s12 container">
				<div class="row">
					<div class="input-field col s10">
						<input type="text" name="nome" value="${ requestScope.nome }" id="inputNome" class="validate" autofocus>  
						<label class="active" for="inputNome">Nome</label> 
					</div>
				</div>
				<div class="row">
					<div class="input-field col s10">
						<input type="email" name="email" value="${ requestScope.email }" id="inputEmail" class="validate" data-error="wrong" data-success="right"> 
						<label class="active" for="inputEmail">E-mail</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s10"> 
						<input type="text" name="cpf" value="${ requestScope.cpf }" id="inputCpf" class="validate">
						<label class="active" for="inputCpf">Cpf</label>
					</div>
				</div>
				<div class="row">
					<div class="input-field col s10"> 
						<input type="password" name="senha" value="${ requestScpope.senha }" id="inputSenha" class="validate"> 
						<label class="active" for="inputSenha">Senha</label> 
					</div>
				</div>
				
				<button type="submit" class="btn waves-effect waves-light white-text deep-purple darken-3" onclick="Materialize.toast('Cadastro conclu�do com sucesso!', 4000)">
					Editar <i class="material-icons right">send</i>
				</button>
				<a class="btn waves-effect waves-light white-text deep-purple darken-3" href="index.html">
					Cancelar
				</a>
			</form>
		</div>
	</main>
	<footer>
		<c:import url="rodape.jsp" />
	</footer>
	<script type="text/javascript">
		$(document).ready(function() {
		    Materialize.updateTextFields();
		});
	</script>
</body>
</html>