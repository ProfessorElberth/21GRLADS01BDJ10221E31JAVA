package br.edu.infnet.AppFinal.model.tests;

import br.edu.infnet.AppFinal.model.domain.Analise;
import br.edu.infnet.AppFinal.model.domain.Desenvolvimento;
import br.edu.infnet.AppFinal.model.domain.Implantacao;
import br.edu.infnet.AppFinal.model.exceptions.DescricaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeEntrevistasInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeHoraTarefaInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadePontoFuncaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeServidorInvalidaException;

public class TarefaTeste {

	public static void main(String[] args) {
		try {
			//caso de sucesso
			Analise analise = new Analise("Levantamento de requisitos", 8);
			analise.setQtdeHora(30);
			analise.setDiagramas(true);
			System.out.println(analise);
		} catch (QuantidadeEntrevistasInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}

		try {
			//caso de sucesso
			Desenvolvimento desenvolvimento = new Desenvolvimento("Criação da camada de visão");
			desenvolvimento.setQtdeHora(75);
			desenvolvimento.setPontosFuncao(10);
			desenvolvimento.setTecnologiaPrincipal("java");
			System.out.println(desenvolvimento);
		} catch (QuantidadePontoFuncaoInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}

		try {
			//caso de sucesso
			Implantacao implantacao = new Implantacao("Criação dos conteiners");
			implantacao.setQtdeHora(70);
			implantacao.setDevops(true);
			implantacao.setQtdeServidor(5);
			System.out.println(implantacao);
		} catch (QuantidadeServidorInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}
	}
}
