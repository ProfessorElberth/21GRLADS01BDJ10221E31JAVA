package br.com.infnet.review.model.testes;

import java.util.ArrayList;
import java.util.List;

import br.com.infnet.review.model.domain.Movel;
import br.com.infnet.review.model.domain.Venda;
import br.com.infnet.review.model.exceptions.TamanhoIncorretoException;

public class VendaTeste {

	public static void main(String[] args) {
		
		List<Movel> listagem = new ArrayList<Movel>();
		
		try {
			Movel gaveteiro = new Movel();
			gaveteiro.setDescricao("Gaveteiro Luxo");
			gaveteiro.setQtdeGaveta(18);
			gaveteiro.setRoda(false);
			gaveteiro.setTamanho(50);

			listagem.add(gaveteiro);
		} catch (TamanhoIncorretoException e) {
			System.out.println(e.getMessage());
		}

		try {
			Movel rack = new Movel();
			rack.setDescricao("Mega Rack");
			rack.setQtdeGaveta(0);
			rack.setRoda(true);
			rack.setTamanho(2000);

			listagem.add(rack);
		} catch (TamanhoIncorretoException e) {
			System.out.println(e.getMessage());
		}

		Venda venda = new Venda();
		venda.setVendedor("Sr Manoel");
		venda.setMoveis(listagem);
		venda.impressao();
	}
}
