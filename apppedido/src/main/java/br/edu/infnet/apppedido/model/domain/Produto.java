package br.edu.infnet.apppedido.model.domain;

public abstract class Produto {

	private String nome;
	private float valor;
	private int codigo;

	public Produto(String nome, float valor, int codigo) {
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
	}
	
	public abstract float calcularValorVenda();

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(codigo);
		
		return sb.toString();
	}

	public String getNome() {
		return nome;
	}
	public float getValor() {
		return valor;
	}
	public int getCodigo() {
		return codigo;
	}
}