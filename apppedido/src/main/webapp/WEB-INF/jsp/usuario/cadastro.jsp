<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<form action="/usuario/incluir" method="post">	
			<div class="form-group">
		      <label>Nome:</label>
		      <input value="Elberth Moraes" type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
		    </div>			
		
			<div class="form-group">
		      <label>E-mail:</label>
		      <input value="elberth@moraes.com" type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
		    </div>			
			
		    <div class="form-group">
		      <label>Senha:</label>
		      <input type="password" value="elberth.moraes@prof.infnet.edu.br" class="form-control" placeholder="Entre com a senha" name="senha">
		    </div>
			
			<button class="btn btn-primary" type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>