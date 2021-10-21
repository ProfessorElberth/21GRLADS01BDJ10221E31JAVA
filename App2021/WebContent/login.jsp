<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<%String mensagem = (String)request.getAttribute("msg");%>

<div class="container">
  <h2>Sistema de Cadastramento de Alunos</h2>
  
  <%if(mensagem != null){%>
	<div class="alert alert-warning">
		 <strong>Alerta!</strong> <%=mensagem%>
	</div>
  <%}%>
  
  <form action="acesso" method="post">
    <div class="form-group">
      <label>Email:</label>
      <input type="email" value="elberth.moraes@prof.infnet.edu.br" class="form-control" placeholder="Entre com o e-mail" name="email">
    </div>
    
    <div class="form-group">
      <label>Senha:</label>
      <input type="password" value="elberth.moraes@prof.infnet.edu.br" class="form-control" placeholder="Entre com a senha" name="senha">
    </div>

    <button type="submit" class="btn btn-primary">Acessar</button>
  </form>
</div>
</body>
</html>