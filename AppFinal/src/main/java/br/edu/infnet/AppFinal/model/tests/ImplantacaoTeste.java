package br.edu.infnet.AppFinal.model.tests;

import br.edu.infnet.AppFinal.model.domain.Implantacao;
import br.edu.infnet.AppFinal.model.exceptions.DescricaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeHoraTarefaInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeServidorInvalidaException;

public class ImplantacaoTeste {

	public static void main(String[] args) {
		
		try {
			//caso de sucesso
			Implantacao implantacao = new Implantacao("Criação dos conteiners");
			implantacao.setQtdeHora(70);
			implantacao.setDevops(true);
			implantacao.setQtdeServidor(5);
			System.out.println("Valor: " + implantacao.calcularValor());
		} catch (QuantidadeServidorInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}
	}
}
