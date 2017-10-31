<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>Lista de Funcionários</title>
<c:import url="default-import.jsp"/>
</head>
<body>
	<header>	
		<!-- Navbar -->
		<nav class="deep-purple darken-3">
			<div class="nav-wrapper">
				<a href="index.html" class="brand-logo center"><i class="material-icons">euro_symbol</i>Empresa dos Chupinga</a>
				<a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
				<ul id="nav-mobile" class="right hide-on-med-and-down">
					<li><a href="index.html">Home</a></li>
					<li><a href="mvc?logica=ListaFuncionariosLogica">Listar Funcionários</a></li>
					<li><a href="mvc?logica=AdicionaFuncionarioLogica">Cadastrar Funcionários</a></li>
				</ul>
				<ul class="side-nav" id="mobile-demo">
					<li><a href="index.html">Home</a></li>
					<li><a href="mvc?logica=ListaFuncionariosLogica">Listar Funcionários</a></li>
					<li><a href="mvc?logica=AdicionaFuncionarioLogica">Cadastrar Funcionários</a></li>
				</ul>
			</div>
		</nav>
	</header>

	<!-- Cria uma instância de ContatoDao -->
	<!-- ConatoDao dao = new ContatoDao() -->
	<!-- Também abre uma conexão com o banco de dados -->
	
	<table class="striped responsive-table">
	  <thead>
		<tr class="center-align">
			<th>Nº</th>
			<th>Nome do Chupinga:</th>
			<th>E-mail:</th>
			<th>CPF:</th>
			<th>Senha:</th>
			<th colspan="3">Ações</th>
		</tr>
	  </thead>
	  <tbody>
		<c:forEach var="funcionario" items="${ funcionarios }" varStatus="id">
		<tr>
			<td>${ id.count }</td>
			<td>${ funcionario.nome }</td>
			<td>
				<c:if test="${ not empty funcionario.email }">
					<a href="mailto:${ funcionario.email }">
						${ funcionario.email }
					</a>
				</c:if>
				<c:if test="${ empty funcionario.email }">
					E-mail não informado 
				</c:if>
				
			</td>
			<td>
				${ funcionario.cpf }
			</td>
			<td>
				${ funcionario.senha }
			</td>
			<td>
				<a href="mvc?logica=RemoveFuncionarioLogica&id=${ funcionario.id }"><div class="chip waves-effect waves-light white-text deep-purple darken-3">Excluir</div></a>
				
				<a href="mvc?logica=ExibeFuncionarioLogica&id=${ funcionario.id }"><div class="chip waves-effect waves-light white-text deep-purple darken-3">Editar</div></a>
			</td>
		</tr>
		</c:forEach>
	  </tbody>
	</table>

	<footer>
		<c:import url="rodape.jsp"></c:import>
	</footer>
	<script type="text/javascript">
        $(".button-collapse").sideNav();
    </script>
</body>
</html>