<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>Lista de Funcionários</title>
</head>

<style type="text/css">
	table, th, td {
		border: 1px solid black;
		border-collapse: collapse;
	} 
	th, td {
		padding: 10px;
	}
</style>
<body>
	<header>	
		<c:import url="cabecalho.jsp"></c:import>
	</header>

	<!-- Cria uma instância de ContatoDao -->
	<!-- ConatoDao dao = new ContatoDao() -->
	<!-- Também abre uma conexão com o banco de dados -->
	<jsp:useBean id="dao" class="br.senai.sp.informatica.empresadoschupinga.dao.FuncionarioDao" />
	
	<table>
		<tr>
			<th>Nº</th>
			<th>Nome:</th>
			<th>E-mail:</th>
			<th>CPF:</th>
			<th>Senha:</th>
		</tr>
		<c:forEach var="funcionario" items="${ dao.lista }" varStatus="id">
		<tr style="background-color: #${ id.count % 2 == 0 ? 'FFF8E1' : '00E5FF'}">
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
		</tr>
		</c:forEach>
	</table>

	<footer>
		<c:import url="rodape.jsp"></c:import>
	</footer>
</body>
</html>