package br.edu.infnet.model.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Aluno;

public class AlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Aluno> lista;
	
	public AlunoController() {
		lista = new ArrayList<Aluno>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.getRequestDispatcher("home.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Aluno aluno = new Aluno(request.getParameter("nome"), request.getParameter("email"));
		aluno.setIdade(Integer.valueOf(request.getParameter("idade")));
		aluno.setMensalidade(Float.valueOf(request.getParameter("mensalidade")));
		aluno.setEscolaridade(request.getParameter("escolaridade"));
		aluno.setDisciplinas(request.getParameterValues("disciplinas"));
		aluno.setRegiao(request.getParameter("regiao"));
		
		lista.add(aluno);

		PrintWriter out = response.getWriter();

		out.println(
				"<!DOCTYPE html>" + 
				"<html>" + 
				"<head>" + 
				"<meta charset='ISO-8859-1'>" + 
				"<title>App2021 - Elberth</title>" + 
				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">" + 
				"</head>" + 
				"<body>" + 
				"	<div class=\"container\">" + 
				"		<form action=\"aluno\" method=\"get\">" + 
				"			<h3>Aluno "+ aluno.getNome() +" cadastrado com sucesso!!!</h3>" + 
				"			<button class=\"btn btn-primary\" type=\"submit\">Voltar</button>" + 
				"		</form>"); 

		out.println("<hr>");
		out.println("<h4>Listagem de alunos ("+lista.size()+"):</h4>");
		
		for(Aluno a : lista) {
			out.println("<h5>" + a.getNome() + " - " + a.getEmail() + "</h5>");
		}

		out.println(		
				"	</div>" + 
				"</body>" + 
				"</html>");		
	}
}