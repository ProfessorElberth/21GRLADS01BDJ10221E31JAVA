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
		<form action="/pedido/incluir" method="post">	
			<div class="form-group">
		      <label>Descrição:</label>
		      <input value="Meu Pedido" type="text" class="form-control" placeholder="Entre com a descrição do pedido" name="descricao">
		    </div>			

			<div class="form-group">
		      <label>Produtos:</label>
		      <c:forEach var="p" items="${produtos}">
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="checkbox" name="produtoIds" class="form-check-input" value="${p.id}"> ${p.nome}
				  </label>
				</div>
			  </c:forEach>			
			</div>
			
			<div class="form-group">
		      <label>Solicitante:</label>
				<select class="form-control" name="solicitante.id">
				  <c:forEach var="s" items="${solicitantes}">
					<option value="${s.id}">${s.nome}</option>
				  </c:forEach>
				</select>
			</div>

			<button class="btn btn-primary" type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>