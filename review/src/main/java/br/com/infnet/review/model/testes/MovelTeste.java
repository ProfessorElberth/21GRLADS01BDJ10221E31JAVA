package br.com.infnet.review.model.testes;

import br.com.infnet.review.model.domain.Movel;
import br.com.infnet.review.model.exceptions.TamanhoIncorretoException;

public class MovelTeste {

	public static void main(String[] args) {

		try {
			Movel gaveteiro = new Movel();
			gaveteiro.setDescricao("Gaveteiro Luxo");
			gaveteiro.setQtdeGaveta(18);
			gaveteiro.setRoda(false);
			gaveteiro.setTamanho(150);
			System.out.println("Valor de venda: " + gaveteiro.calcularValorVenda());
		} catch (TamanhoIncorretoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Movel rack = new Movel();
			rack.setDescricao("Mega Rack");
			rack.setQtdeGaveta(0);
			rack.setRoda(true);
			rack.setTamanho(200);
			rack.impressao();
		} catch (TamanhoIncorretoException e) {
			System.out.println(e.getMessage());
		}
	}
}