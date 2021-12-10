package br.edu.infnet.AppFinal.model.domain;

import br.edu.infnet.AppFinal.auxiliar.Constante;
import br.edu.infnet.AppFinal.model.exceptions.DescricaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadePontoFuncaoInvalidaException;

public class Desenvolvimento extends Tarefa {

	private float pontosFuncao;
	private String tecnologiaPrincipal;

	public Desenvolvimento(String descricao) throws DescricaoInvalidaException {
		super(descricao);
		this.pontosFuncao = Constante.PONTO_FUNCAO;
	}
	
	@Override
	public float calcularValor() {

		return this.getQtdeHora() * Constante.VALOR +
				this.getPontosFuncao() * Constante.VALOR +
				(Constante.LINGUAGEM.equalsIgnoreCase(this.getTecnologiaPrincipal()) ? Constante.VALOR : Constante.VALOR/2);
	}

	@Override
	public String toString() {

		return String.format("%s;%.2f;%s",
					super.toString(),
					pontosFuncao,
					tecnologiaPrincipal
				);
	}

	public float getPontosFuncao() {
		return pontosFuncao;
	}
	public String getTecnologiaPrincipal() {
		return tecnologiaPrincipal;
	}
	public void setPontosFuncao(float pontosFuncao) throws QuantidadePontoFuncaoInvalidaException {
		
		if(pontosFuncao <= 0 || pontosFuncao >= Constante.PONTO_FUNCAO*10) {
			throw new QuantidadePontoFuncaoInvalidaException("A quantidade de pontos de função não pode estar zerada, nem negativa, nem superior a " + Constante.PONTO_FUNCAO*10);
		}
		
		this.pontosFuncao = pontosFuncao;
	}
	public void setTecnologiaPrincipal(String tecnologiaPrincipal) {
		this.tecnologiaPrincipal = tecnologiaPrincipal;
	}
}
