package br.edu.infnet.apppedido.model.domain;

import br.edu.infnet.apppedido.model.exceptions.QuantidadeNegativaException;

public class Sobremesa extends Produto {
	
	private boolean doce;
	private String informacao;
	private float quantidade;

	public Sobremesa(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
	}

	@Override
	public float calcularValorVenda() {		
		return getValor() + (doce ? 3 : 0) + 0.03f * quantidade;
	}

	public boolean isDoce() {
		return doce;
	}

	public void setDoce(boolean doce) {
		this.doce = doce;
	}

	public String getInformacao() {
		return informacao;
	}

	public void setInformacao(String informacao) {
		this.informacao = informacao;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) throws QuantidadeNegativaException {
		
		if(quantidade <= 0) {
			throw new QuantidadeNegativaException("Impossível calcular o valor de venda com a quantidade negativa!!!");
		}
		
		this.quantidade = quantidade;
	}
}