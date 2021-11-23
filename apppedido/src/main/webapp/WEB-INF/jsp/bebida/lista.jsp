<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.infnet.apppedido.model.domain.Aluno"%>
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
		
		<a href="/bebida">Nova bebida</a>
	
		<hr>
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				 <strong>Confirmação!</strong> A bebida ${nome} foi cadastrada com sucesso!!!
			</div>
		</c:if>
		
		<c:if test="${not empty listaBebidas}">
		
			<h4>Listagem de bebidas (${listaBebidas.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Nome</th>
			        <th>Valor</th>
			        <th>Código</th>
			        <th>Gelada</th>
			        <th>Tamanho</th>
			        <th>Marca</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="b" items="${listaBebidas}">
				      <tr>
				      	<td>${b.id}</td>
				        <td>${b.nome}</td>
				        <td>${b.valor}</td>
				        <td>${b.codigo}</td>
				        <td>${b.gelada}</td>
				        <td>${b.tamanho}</td>
				        <td>${b.marca}</td>
				        <td><a href="/bebida/${b.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaBebidas}">
	  		<h4>Não existem bebidas cadastradas!</h4>
	  	</c:if>
	</div>
</body>
</html>