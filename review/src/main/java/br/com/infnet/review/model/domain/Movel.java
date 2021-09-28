package br.com.infnet.review.model.domain;

import br.com.infnet.review.model.exceptions.TamanhoIncorretoException;

public class Movel {
	
	private boolean roda;
	private float tamanho;
	private String descricao;
	private int qtdeGaveta;

	public float calcularValorVenda() {
		return (roda ? 100 : 0) + (tamanho * 10) + (qtdeGaveta * 20);
	}
	
	public void impressao() {
		System.out.println("O móvel " + descricao + " custa R$" + calcularValorVenda());
	}

	public boolean isRoda() {
		return roda;
	}
	public void setRoda(boolean roda) {
		this.roda = roda;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) throws TamanhoIncorretoException {

		if(tamanho < 100 || tamanho > 1000) {
			throw new TamanhoIncorretoException("Impossível realizar o cálculo com o tamanho incorreto!!!");
		}
		
		this.tamanho = tamanho;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdeGaveta() {
		return qtdeGaveta;
	}
	public void setQtdeGaveta(int qtdeGaveta) {
		this.qtdeGaveta = qtdeGaveta;
	}
}