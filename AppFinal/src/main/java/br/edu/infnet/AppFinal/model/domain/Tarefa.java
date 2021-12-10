package br.edu.infnet.AppFinal.model.domain;

import br.edu.infnet.AppFinal.auxiliar.Constante;
import br.edu.infnet.AppFinal.model.exceptions.DescricaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeHoraTarefaInvalidaException;

public abstract class Tarefa {

	private String descricao;
	private int qtdeHora;
	
	public Tarefa(String descricao) throws DescricaoInvalidaException {
		
		if(descricao == null) {
			throw new DescricaoInvalidaException("A descrição da tarefa precisa ser preenchida!");
		}
		
		this.descricao = descricao;
		this.qtdeHora = Constante.QTDE_HORA;
	}
	
	public abstract float calcularValor();
	
	@Override
	public String toString() {

		return String.format("%s;%d", descricao, qtdeHora);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public int getQtdeHora() {
		return qtdeHora;
	}
	public void setQtdeHora(int qtdeHora) throws QuantidadeHoraTarefaInvalidaException {
		
		if(qtdeHora <= 0 || qtdeHora >= Constante.QTDE_HORA*2) {
			throw new QuantidadeHoraTarefaInvalidaException("A quantidade de hora não pode estar zerada, nem negativa, nem superior a " + Constante.QTDE_HORA*2);
		}
		
		this.qtdeHora = qtdeHora;
	}
}