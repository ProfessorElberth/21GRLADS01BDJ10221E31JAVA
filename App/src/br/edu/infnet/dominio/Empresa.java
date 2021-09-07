package br.edu.infnet.dominio;

import br.edu.infnet.exceptions.FaturamentoInvalidoException;
import br.edu.infnet.exceptions.NomeIncompletoException;

public class Empresa {

	private String nome;
	private String sobrenome;
	private String ultimonome;
	private float faturamento;
	
	public String getNome() throws NomeIncompletoException {

		if(ultimonome == null || nome == null || sobrenome == null) {
			throw new NomeIncompletoException("O preenchimento do campo 'nome' está incorreto");
		}
		
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
	
	public void impressao() throws NomeIncompletoException {		
		System.out.println(getNome() + " - " + getFaturamento());
	}

	public float getFaturamento() {
		return faturamento;
	}

	public void setFaturamento(float faturamento) throws FaturamentoInvalidoException {
		
		if(faturamento <= 0) {
			throw new FaturamentoInvalidoException("Faturamento inválido! Precisa ser maior que zero");
		}
				
		this.faturamento = faturamento;
	}
}