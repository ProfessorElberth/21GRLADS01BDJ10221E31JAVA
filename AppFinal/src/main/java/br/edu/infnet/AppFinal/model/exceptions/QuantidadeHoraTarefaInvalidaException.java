package br.edu.infnet.AppFinal.model.exceptions;

public class QuantidadeHoraTarefaInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public QuantidadeHoraTarefaInvalidaException(String mensagem) {
		super(mensagem);
	}
}