package br.edu.infnet.apppedido.model.testes;

import br.edu.infnet.apppedido.model.domain.Solicitante;

public class SolicitanteTeste {

	public static void main(String[] args) {
		
		Solicitante solicitante = new Solicitante("Joaozinho", "123456789-12", "joao@joao.com");
		System.out.println(solicitante);
	}
}
