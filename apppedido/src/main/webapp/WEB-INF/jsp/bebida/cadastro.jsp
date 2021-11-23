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
		<form action="/bebida/incluir" method="post">	
			<div class="form-group">
		      <label>Nome:</label>
		      <input value="Refrigerante" type="text" class="form-control" placeholder="Entre com o nome da bebida" name="nome">
		    </div>			
		
			<div class="form-group">
		      <label>Código:</label>
		      <input value="123" type="text" class="form-control" placeholder="Entre com o código da bebida" name="codigo">
		    </div>			

			<div class="form-group">
		      <label>Valor:</label>
		      <input value="1000" type="text" class="form-control" placeholder="Entre com o valor da bebida" name="valor">
		    </div>			

			<div class="form-group">
		      <label>Tamanho:</label>
		      <input value="500" type="text" class="form-control" placeholder="Entre com o tamanho da bebida" name="tamanho">
		    </div>			

			<div class="form-group">
		      <label>Marca:</label>
		      <input value="Coke" type="text" class="form-control" placeholder="Entre com a marca da bebida" name="marca">
		    </div>			

			<div class="form-group">
		      <label>Característica:</label>
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="checkbox" name="gelada" class="form-check-input" value="true"> Gelada
				  </label>
				</div>			
			</div>

			<button class="btn btn-primary" type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>