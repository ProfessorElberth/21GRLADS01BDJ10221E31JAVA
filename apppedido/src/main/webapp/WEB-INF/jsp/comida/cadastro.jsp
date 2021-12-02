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
		<form action="/comida/incluir" method="post">	
			<div class="form-group">
		      <label>Nome:</label>
		      <input value="Pizza" type="text" class="form-control" placeholder="Entre com o nome da comida" name="nome">
		    </div>			
		
			<div class="form-group">
		      <label>Código:</label>
		      <input value="123" type="text" class="form-control" placeholder="Entre com o código da comida" name="codigo">
		    </div>			

			<div class="form-group">
		      <label>Valor:</label>
		      <input value="1000" type="text" class="form-control" placeholder="Entre com o valor da comida" name="valor">
		    </div>			

			<div class="form-group">
		      <label>Peso:</label>
		      <input value="500" type="text" class="form-control" placeholder="Entre com o peso da comida" name="peso">
		    </div>			

			<div class="form-group">
		      <label>Ingredientes:</label>
		      <input value="Tomate, presunto, queijo" type="text" class="form-control" placeholder="Entre com os ingredientes da comida" name="ingredientes">
		    </div>			

			<div class="form-group">
		      <label>Característica:</label>
				<div class="form-check-inline">
				  <label class="form-check-label">
				    <input type="checkbox" name="vegano" class="form-check-input" value="true"> Vegano
				  </label>
				</div>			
			</div>

			<button class="btn btn-primary" type="submit">Cadastrar</button>
		</form>
	</div>
</body>
</html>