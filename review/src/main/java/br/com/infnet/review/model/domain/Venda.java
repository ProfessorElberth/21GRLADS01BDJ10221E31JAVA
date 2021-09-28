package br.com.infnet.review.model.domain;

import java.util.List;

public class Venda {

	private String vendedor;
	private List<Movel> moveis;
	
	private float calcularValorVenda() {
		
		float soma = 0;
		
		for(Movel movel: moveis) {
			soma = soma + movel.calcularValorVenda();
		}
		
		return soma;
	}
	
	public void impressao() {
		
		if(moveis.size() == 0) {
			System.out.println(vendedor + " não vendeu nada hoje!");
		} else {
			System.out.println("O " + vendedor + " realizou a venda de "+ moveis.size() +" móveis: R$" + calcularValorVenda());
		}
	}
	
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public List<Movel> getMoveis() {
		return moveis;
	}
	public void setMoveis(List<Movel> moveis) {
		this.moveis = moveis;
	}
}