<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Funcionarios</title>
<c:import url="default-import.jsp"/>
</head>
<body>
	<c:import url="cabecalho.jsp" />
	<div class="row">
		<form action="mvc?logica=EditaFuncionarioLogica&id=${ requestScope.id }" method="post" class="col s12">
			<div class="row">
				<div class="input-field col s10">
					<input type="text" name="nome" value="${ requestScope.nome }" id="inputNome" class="validade" autofocus>  
					<label class="active" for="inputNome">Nome</label> 
				</div>
			</div>
			<div class="row">
				<div class="input-field col s10">
					<input type="email" name="email" value="${ requestScope.email }" id="inputEmail" class="validade" data-error="wrong" data-success="right"> 
					<label class="active" for="inputEmail">E-mail</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s10"> 
					<input type="text" name="cpf" value="${ requestScope.cpf }" id="inputCpf" class="validade">
					<label class="active" for="inputCpf">Cpf</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s10"> 
					<input type="password" name="senha" value="${ requestScpope.senha }" id="inputSenha" class="validade"> 
					<label class="active" for="inputSenha">Senha</label> 
				</div>
			</div>
			
			<button class="btn waves-effect waves-light" type="submit" name="action">Enviar
    			<i class="material-icons right">send</i>
  			</button>
		</form>
	</div>
	<c:import url="rodape.jsp" />
	<script type="text/javascript">
	$(document).ready(function() {
		    Materialize.updateTextFields();
	});
	</script>
</body>
</html>