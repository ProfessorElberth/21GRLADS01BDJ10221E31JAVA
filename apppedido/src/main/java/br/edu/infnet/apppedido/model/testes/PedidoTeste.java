package br.edu.infnet.apppedido.model.testes;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Produto;
import br.edu.infnet.apppedido.model.domain.Solicitante;
import br.edu.infnet.apppedido.model.exceptions.PesoZeradoException;
import br.edu.infnet.apppedido.model.exceptions.TamanhoNegativoException;

public class PedidoTeste {

	public static void main(String[] args) {
		
		Comida hamburguer = new Comida("Hamb", 10, 111);
		try {
			hamburguer.setIngredientes("outros ingredientes");
			hamburguer.setPeso(500);
			hamburguer.setVegano(false);
		} catch (PesoZeradoException e) {
			System.out.println(e.getMessage());
		}
		
		Bebida refri = new Bebida("Coke", 4, 999);
		try {
			refri.setGelada(true);
			refri.setMarca("Coca-cola");
			refri.setTamanho(290);
		} catch (TamanhoNegativoException e) {
			System.out.println(e.getMessage());
		}

		Bebida caldereta = new Bebida("Chope escuro", 12, 987);
		try {
			caldereta.setGelada(true);
			caldereta.setMarca("Brahma");
			caldereta.setTamanho(900);
		} catch (TamanhoNegativoException e) {
			System.out.println(e.getMessage());
		}

		List<Produto> listaLanche = new ArrayList<Produto>();		
		listaLanche.add(hamburguer);
		
		List<Produto> listaChopinho = new ArrayList<Produto>();
		listaLanche.add(refri);
		listaChopinho.add(caldereta);

		Solicitante solicitante = new Solicitante("maria", "987987987-98", "maria@maria.com");
		
		Pedido lanche = new Pedido();
		lanche.setDescricao("Lanche da noite");
		lanche.setWeb(true);
		lanche.setSolicitante(solicitante);
		lanche.setProdutos(listaLanche);
		System.out.println(lanche);

		Pedido chopinho = new Pedido();
		chopinho.setDescricao("Balada");
		chopinho.setWeb(false);
		chopinho.setSolicitante(solicitante);
		chopinho.setProdutos(listaChopinho);
		System.out.println(chopinho);
	}
}