package br.edu.infnet.apppedido.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pedido {

	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private Solicitante solicitante;
	private List<Produto> produtos;

	public Pedido() {
		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		StringBuilder sb = new StringBuilder();
		sb.append(descricao);
		sb.append(";");
		sb.append(data.format(formato));
		sb.append(";");
		sb.append(web ? "web" : "loja");
		sb.append(";");
		sb.append(solicitante.toString());
		sb.append(";");
		if(produtos != null) {
			sb.append(produtos.size());
		}
		
		return sb.toString();
	}
	
	public boolean isWeb() {
		return web;
	}
	public void setWeb(boolean web) {
		this.web = web;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Solicitante getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}