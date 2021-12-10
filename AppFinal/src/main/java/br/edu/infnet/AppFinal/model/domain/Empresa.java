package br.edu.infnet.AppFinal.model.domain;

public class Empresa {

	private String razaoSocial;
	private String diretor;
	
	@Override
	public String toString() {
		return razaoSocial + ";" + diretor;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
}