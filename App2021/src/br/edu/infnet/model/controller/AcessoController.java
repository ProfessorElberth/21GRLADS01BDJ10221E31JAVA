package br.edu.infnet.model.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.infnet.model.domain.Usuario;
import br.edu.infnet.model.repository.AcessoRepository;

public class AcessoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AcessoController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");		
		String senha = request.getParameter("senha");
		
		Usuario usuario = AcessoRepository.validar(email, senha);
		
		if(usuario != null) {
			request.getRequestDispatcher("home.html").forward(request, response);
		} else {
			request.getRequestDispatcher("erro.html").forward(request, response);
		}
	}
}