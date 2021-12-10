<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.infnet.apppedido.model.domain.Solicitante"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Gestão de Pedidos</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">	
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				 <strong>Confirmação!</strong> Usuário ${nome} cadastrado com sucesso!!!
			</div>
		</c:if>
		
		<c:if test="${not empty listaUsuarios}">
		
			<h4>Listagem de usuários (${listaUsuarios.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Nome</th>
			        <th>Email</th>
			        <th>Solicitantes</th>
			        <th>Produtos</th>
			        <th>Pedidos</th>
			        <c:if test="${user.admin}">
			        	<th></th>
			        </c:if>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="u" items="${listaUsuarios}">
				      <tr>
				      	<td>${u.id}</td>
				        <td>${u.nome}</td>
				        <td>${u.email}</td>
				        <td>${u.solicitantes.size()}</td>
				        <td>${u.produtos.size()}</td>
				        <td>${u.pedidos.size()}</td>
				        <c:if test="${user.admin}">
				        	<td><a href="/usuario/${u.id}/excluir">
							<c:choose>
								<c:when test = "${user.id != u.id}">
								Excluir
								</c:when>
							</c:choose>
				        	</a>
				        	</td>
				        	
				        </c:if>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaUsuarios}">
	  		<h4>Não existem usuários cadastrados!</h4>
	  	</c:if>
	</div>
</body>
</html>