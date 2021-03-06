<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<c:import url="defaultimport.jsp"/>
<title>Lista de Contatos</title>
</head>
<body>
	<header>	
		<c:import url="cabecalho.jsp"></c:import>
	</header>

	<!-- Cria uma instância de ContatoDao -->
	<!-- ConatoDao dao = new ContatoDao() -->
	<!-- Também abre uma conexão com o banco de dados -->
	
	<table>
	  <thead>
		<tr>
			<th>Nº</th>
			<th>Nome:</th>
			<th>E-mail:</th>
			<th>Endereço:</th>
			<th>Data de Nascimento:</th>
			<th colspan="3">Ações</th>
		</tr>
	  </thead>
	  <tbody>
		<c:forEach var="contato" items="${ contatos }" varStatus="id">
		<tr style="background-color: #${ id.count % 2 == 0 ? 'FFF8E1' : '00E5FF'}">
			<td>${ id.count }</td>
			<td>${ contato.nome }</td>
			<td>
				<c:if test="${ not empty contato.email }">
					<a href="mailto:${ contato.email }">
						${ contato.email }
					</a>
				</c:if>
				<c:if test="${ empty contato.email }">
					E-mail não informado 
				</c:if>
				
			</td>
			<td>${ contato.endereco }</td>
			<td>
				<fmt:formatDate value="${ contato.dataNascimento.time }" pattern="dd/MM/yyyy"/>
			</td>
			<td>
				<a href="mvc?logica=RemoveContatoLogica&id=${contato.id }">
						Excluir
				</a>
				<a href="mvc?logica=ExibeContatoLogica&id=${contato.id }">
						Editar
				</a>
			</td>
		</tr>
		</c:forEach>
	  </tbody>
	</table>

	<footer>
		<c:import url="rodape.jsp"></c:import>
	</footer>
</body>
</html>