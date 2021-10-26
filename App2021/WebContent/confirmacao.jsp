<%@page import="java.util.List"%>
<%@page import="br.edu.infnet.model.domain.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<%String nome = (String)request.getAttribute("nomeAluno");%>
	
	<div class="container"> 
		<form action="aluno" method="get"> 
			<input type="hidden" value="confirmacao" name="tela">
			<h3>Aluno <%=nome%> cadastrado com sucesso!!!</h3> 
			<button class="btn btn-primary" type="submit">Voltar</button> 
		</form>		 
	</div>
</body>
</html>