package br.edu.infnet.AppFinal.model.exceptions;

public class QuantidadeServidorInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public QuantidadeServidorInvalidaException(String mensagem) {
		super(mensagem);
	}
}