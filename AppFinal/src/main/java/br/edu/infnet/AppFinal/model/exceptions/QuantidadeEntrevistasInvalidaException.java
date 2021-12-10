package br.edu.infnet.AppFinal.model.exceptions;

public class QuantidadeEntrevistasInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public QuantidadeEntrevistasInvalidaException(String mensagem) {
		super(mensagem);
	}
}