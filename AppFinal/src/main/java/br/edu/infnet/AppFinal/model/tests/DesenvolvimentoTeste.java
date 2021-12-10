package br.edu.infnet.AppFinal.model.tests;

import br.edu.infnet.AppFinal.model.domain.Desenvolvimento;
import br.edu.infnet.AppFinal.model.exceptions.DescricaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeHoraTarefaInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadePontoFuncaoInvalidaException;

public class DesenvolvimentoTeste {

	public static void main(String[] args) {
		
		try {
			//caso de sucesso
			Desenvolvimento desenvolvimento = new Desenvolvimento("Criação da camada de visão");
			desenvolvimento.setQtdeHora(75);
			desenvolvimento.setPontosFuncao(10);
			desenvolvimento.setTecnologiaPrincipal("java");
			System.out.println("Valor: " + desenvolvimento.calcularValor());
		} catch (QuantidadePontoFuncaoInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}
	}
}