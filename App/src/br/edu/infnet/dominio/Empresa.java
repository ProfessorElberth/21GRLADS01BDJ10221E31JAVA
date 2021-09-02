package br.edu.infnet.dominio;

public class Empresa {

	private String nome;
	private String sobrenome;
	private String ultimonome;
	
	public String getNome() {
		
		StringBuilder sb = new StringBuilder();	
		sb.append(ultimonome.toUpperCase().charAt(0));
		sb.append(".");
		sb.append(",");
		sb.append(" ");
		sb.append(nome.toUpperCase());
		sb.append(" ");
		sb.append(sobrenome.toLowerCase());
		sb.append(".");
		
		return sb.toString();
	}
	public void setNome(String nome) {

		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");		

		this.nome = nome.substring(0, posInicial);
		this.sobrenome = nome.substring(posInicial, posFinal).trim();
		this.ultimonome = nome.substring(posFinal).trim();
	}
	
	public void impressao() {
		
		System.out.println(this);
	}

	@Override
	public String toString() {
		return getNome();
	}
}