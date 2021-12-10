package br.edu.infnet.AppFinal.model.domain;

import br.edu.infnet.AppFinal.auxiliar.Constante;
import br.edu.infnet.AppFinal.model.exceptions.DescricaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeServidorInvalidaException;

public class Implantacao extends Tarefa {

	private int qtdeServidor;
	private boolean devops;

	public Implantacao(String descricao) throws DescricaoInvalidaException {
		super(descricao);
		this.qtdeServidor = Constante.QTDE_SERVIDOR;
	}
	
	@Override
	public float calcularValor() {
		return this.getQtdeHora() * Constante.VALOR +
				this.getQtdeServidor() * Constante.VALOR +
				(this.isDevops() ? Constante.VALOR : Constante.VALOR/2);
	}

	@Override
	public String toString() {

		return String.format("%s;%d;%s",
					super.toString(),
					qtdeServidor,
					devops ? "implantação utilizando devops" : "sem uso de devops"
				);
	}

	public int getQtdeServidor() {
		return qtdeServidor;
	}
	public boolean isDevops() {
		return devops;
	}
	public void setQtdeServidor(int qtdeServidor) throws QuantidadeServidorInvalidaException {
		
		if(qtdeServidor <= 0 || qtdeServidor >= Constante.QTDE_SERVIDOR*2) {
			throw new QuantidadeServidorInvalidaException("A quantidade de servidores não pode estar zerada, nem negativa, nem superior a " + Constante.QTDE_SERVIDOR*2);
		}
		
		this.qtdeServidor = qtdeServidor;
	}
	public void setDevops(boolean devops) {
		this.devops = devops;
	}
}