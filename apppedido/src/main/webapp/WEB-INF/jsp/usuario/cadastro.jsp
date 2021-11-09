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
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#">AppPedido</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="#">Home</a></li>
	      <li><a href="/alunos">Aluno</a></li>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	      <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
	      <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	    </ul>
	  </div>
	</nav>

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