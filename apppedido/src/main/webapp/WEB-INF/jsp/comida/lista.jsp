<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		
		<a href="/comida">Nova comida</a>
	
		<hr>
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				 <strong>Confirmação!</strong> A comida ${nome} foi cadastrada com sucesso!!!
			</div>
		</c:if>
		
		<c:if test="${not empty listaComidas}">
		
			<h4>Listagem de comidas (${listaComidas.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Nome</th>
			        <th>Valor</th>
			        <th>Código</th>
			        <th>Peso</th>
			        <th>Vegano</th>
			        <th>Ingredientes</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="c" items="${listaComidas}">
				      <tr>
				      	<td>${c.id}</td>
				        <td>${c.nome}</td>
				        <td>${c.valor}</td>
				        <td>${c.codigo}</td>
				        <td>${c.peso}</td>
				        <td>${c.vegano}</td>
				        <td>${c.ingredientes}</td>
				        <td><a href="/comida/${c.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaComidas}">
	  		<h4>Não existem comidas cadastradas!</h4>
	  	</c:if>
	</div>
</body>
</html>