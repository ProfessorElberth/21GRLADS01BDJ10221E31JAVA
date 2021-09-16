package br.edu.infnet.apppedido.model.testes;

import br.edu.infnet.apppedido.model.domain.Bebida;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Bebida suco = new Bebida("suco", 10, 123);		
		suco.setGelada(true);
		suco.setMarca("sucao");
		suco.setTamanho(500);
		System.out.println(suco);
		
		Bebida cafe = new Bebida("cafezinho", 3, 345);		
		cafe.setGelada(false);
		cafe.setMarca("cafezao");
		cafe.setTamanho(100);
		System.out.println(cafe.calcularValorVenda());

		//TODO instanciar uma comida
		
		//TODO instanciar uma sobremesa
	}
}