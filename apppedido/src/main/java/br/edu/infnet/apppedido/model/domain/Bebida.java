package br.edu.infnet.apppedido.model.domain;

import br.edu.infnet.apppedido.model.exceptions.TamanhoNegativoException;

public class Bebida extends Produto {

	private boolean gelada;
	private float tamanho;
	private String marca; 
	
	public Bebida(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
	}

	@Override
	public float calcularValorVenda() {

		return getValor() + (gelada ? 5 : 0) + 0.01f * tamanho;
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(gelada ? "Gelada" : "Quente");
		sb.append(";");
		sb.append(tamanho);
		sb.append(";");
		sb.append(marca);
		sb.append(";");
		sb.append(calcularValorVenda());
		
		return sb.toString();
	}

	public boolean isGelada() {
		return gelada;
	}

	public void setGelada(boolean gelada) {
		this.gelada = gelada;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) throws TamanhoNegativoException {
		
		if(tamanho <= 0) {
			throw new TamanhoNegativoException("Impossível calcular o valor de venda com o tamanho zerado!!!");
		}
		
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}