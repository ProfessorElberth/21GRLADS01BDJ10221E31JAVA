<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="br.edu.infnet.apppedido.model.domain.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"> -->
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">	
		
		<a href="/aluno">Novo aluno</a>
	
		<hr>
		
		<c:if test="${not empty nome}">
			<div class="alert alert-success">
				 <strong>Confirmação!</strong> Aluno ${nome} cadastrado com sucesso!!!
			</div>
		</c:if>
		
		<c:if test="${not empty listaAlunos}">
		
			<h4>Listagem de alunos (${listaAlunos.size()}):</h4>		
			<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>#</th>
			        <th>Nome</th>
			        <th>Email</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="a" items="${listaAlunos}">
				      <tr>
				      	<td>${a.id}</td>
				        <td>${a.nome}</td>
				        <td>${a.email}</td>
				        <td><a href="/aluno/${a.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
	  	</c:if>
	  			
	  	<c:if test="${empty listaAlunos}">
	  		<h4>Não existem alunos cadastrados!</h4>
	  	</c:if>
	</div>
</body>
</html>