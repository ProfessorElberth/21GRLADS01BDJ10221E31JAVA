package br.edu.infnet.apppedido.model.testes;

import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Solicitante;

public class PedidoTeste {

	public static void main(String[] args) {
		
		Solicitante solicitante = new Solicitante("maria", "987987987-98", "maria@maria.com");

		Pedido lanche = new Pedido();
		lanche.setDescricao("Lanche da noite");
		lanche.setWeb(true);
		lanche.setSolicitante(solicitante);
		System.out.println(lanche);

		Pedido chopinho = new Pedido();
		chopinho.setDescricao("Balada");
		chopinho.setWeb(false);
		chopinho.setSolicitante(solicitante);
		System.out.println(chopinho);
	}
}