package br.edu.infnet.model.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.AcessoRepository;
import br.edu.infnet.model.repository.AlunoRepository;

public class AcessoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AcessoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("login.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");		
		String senha = request.getParameter("senha");
		
		Usuario usuario = AcessoRepository.validar(email, senha);
		
		if(usuario != null) {
			request.setAttribute("listaAlunos", AlunoRepository.obterLista());
			request.getRequestDispatcher("aluno/lista.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", email + ", autenticação inválida.. tente novamente!!!"); 

			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}