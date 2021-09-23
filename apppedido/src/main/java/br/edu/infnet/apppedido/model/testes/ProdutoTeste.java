package br.edu.infnet.apppedido.model.testes;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Sobremesa;
import br.edu.infnet.apppedido.model.exceptions.PesoZeradoException;
import br.edu.infnet.apppedido.model.exceptions.QuantidadeNegativaException;
import br.edu.infnet.apppedido.model.exceptions.TamanhoNegativoException;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		try {
			Bebida suco = new Bebida("suco", 10, 123);		
			suco.setGelada(true);
			suco.setMarca("sucao");
			suco.setTamanho(500);
			System.out.println(suco);
		} catch (TamanhoNegativoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Bebida cafe = new Bebida("cafezinho", 3, 345);		
			cafe.setGelada(false);
			cafe.setMarca("cafezao");
			cafe.setTamanho(100);
			System.out.println("Valor de venda: " + cafe.calcularValorVenda());
		} catch (TamanhoNegativoException e) {
			System.out.println(e.getMessage());
		}		
		
		try {
			Comida churrasco = new Comida("Churrascão", 50, 234);
			churrasco.setIngredientes("Carne, frango, linguiça, molho");
			churrasco.setPeso(300);
			churrasco.setVegano(false);
			System.out.println(churrasco);
		} catch (PesoZeradoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Comida sanduba = new Comida("Sandubão", 5, 456);
			sanduba.setIngredientes("Pão, queijo, presunto");
			sanduba.setVegano(false);
			sanduba.setPeso(100);
			System.out.println("Valor de venda: " + sanduba.calcularValorVenda());
		} catch (PesoZeradoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Sobremesa docinho = new Sobremesa("Docinho da vó", 4, 135);
			docinho.setDoce(false);
			docinho.setInformacao("algumas coisas");
			docinho.setQuantidade(50);
			System.out.println(docinho);
		} catch (QuantidadeNegativaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Sobremesa bolinho = new Sobremesa("Bolo do velho", 6, 432);
			bolinho.setDoce(true);
			bolinho.setInformacao("Mais alguma coisa");
			bolinho.setQuantidade(123);
			System.out.println("Valor de venda: " + bolinho.calcularValorVenda());
		} catch (QuantidadeNegativaException e) {
			System.out.println(e.getMessage());
		}
	}
}