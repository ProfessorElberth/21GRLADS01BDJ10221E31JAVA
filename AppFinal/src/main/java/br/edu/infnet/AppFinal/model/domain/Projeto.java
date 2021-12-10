package br.edu.infnet.AppFinal.model.domain;

import java.util.List;

public class Projeto {
	
	private String apresentacao;
	private String gerente;
	private int complexidade;
	private Empresa empresa;
	private List<Tarefa> tarefas;
	
	public Projeto(String gerente, Empresa empresa) {
		this.apresentacao = "Projeto padrão da empresa";
		this.gerente = gerente;
		this.empresa = empresa;		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(apresentacao);
		sb.append(";");
		sb.append(gerente);
		sb.append(";");
		sb.append(complexidade);
		sb.append(";");
		sb.append(empresa);
		sb.append(";");
		sb.append(tarefas != null ? tarefas.size() : 0);
		sb.append(";");

		return sb.toString();
	}

	public String getApresentacao() {
		return apresentacao;
	}
	public String getGerente() {
		return gerente;
	}
	public int getComplexidade() {
		return complexidade;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public List<Tarefa> getTarefas() {
		return tarefas;
	}
	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}
	public void setComplexidade(int complexidade) {
		this.complexidade = complexidade;
	}
	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
}