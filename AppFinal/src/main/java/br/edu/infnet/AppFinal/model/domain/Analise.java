package br.edu.infnet.AppFinal.model.domain;

import br.edu.infnet.AppFinal.auxiliar.Constante;
import br.edu.infnet.AppFinal.model.exceptions.DescricaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeEntrevistasInvalidaException;

public class Analise extends Tarefa {

	private int qtdeEntrevista;
	private boolean diagramas;

	public Analise(String descricao, int qtdeEntrevista) throws DescricaoInvalidaException, QuantidadeEntrevistasInvalidaException {
		super(descricao);
		
		if(qtdeEntrevista == 0) {
			throw new QuantidadeEntrevistasInvalidaException("Não é permitido ter a quantidade de entrevistas zerada!");
		}
		
		if(qtdeEntrevista < 0) {
			throw new QuantidadeEntrevistasInvalidaException("Não é permitido ter a quantidade de entrevistas negativa!");
		}

		this.qtdeEntrevista = qtdeEntrevista;
	}
	
	@Override
	public float calcularValor() {

		return this.getQtdeHora() * Constante.VALOR +
				this.getQtdeEntrevista() * Constante.VALOR +
				(this.isDiagramas() ? Constante.VALOR : Constante.VALOR/2);
	}

	@Override
	public String toString() {

		return String.format("%s;%d;%s", 
				super.toString(), 
				qtdeEntrevista, 
				diagramas ? "análise com diagramas" : "análise sem diagramas"
			);
	}
	
	public int getQtdeEntrevista() {
		return qtdeEntrevista;
	}
	public boolean isDiagramas() {
		return diagramas;
	}
	public void setDiagramas(boolean diagramas) {
		this.diagramas = diagramas;
	}
}