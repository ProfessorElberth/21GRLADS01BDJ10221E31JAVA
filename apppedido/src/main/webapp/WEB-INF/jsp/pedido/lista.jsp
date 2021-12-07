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
		
		<a href="/pedido">Novo pedido</a>
	
		<hr>
		
		<c:if test="${not empty descricao}">
			<div class="alert alert-success">
				 <strong>Confirmação!</strong> Pedido ${descricao} cadastrado com sucesso!!!
			</div>
		</c:if>
		
		<c:if test="${not empty listaPedidos}">
		
			<h4>Listagem de pedidos (${listaPedidos.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Descricao</th>
			        <th>WEB</th>
			        <th>Solicitante</th>
			        <th>Produtos</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="p" items="${listaPedidos}">
				      <tr>
				      	<td>${p.id}</td>
				        <td>${p.descricao}</td>
				        <td>${p.web}</td>
				        <td>${p.solicitante.nome}</td>
				        <td>${p.produtos.size()}</td>
				        <td><a href="/pedido/${p.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaPedidos}">
	  		<h4>Não existem pedidos cadastrados!</h4>
	  	</c:if>
	</div>
</body>
</html>