package br.edu.infnet.AppFinal.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.AppFinal.model.domain.Analise;
import br.edu.infnet.AppFinal.model.domain.Desenvolvimento;
import br.edu.infnet.AppFinal.model.domain.Empresa;
import br.edu.infnet.AppFinal.model.domain.Implantacao;
import br.edu.infnet.AppFinal.model.domain.Projeto;
import br.edu.infnet.AppFinal.model.domain.Tarefa;
import br.edu.infnet.AppFinal.model.exceptions.DescricaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeEntrevistasInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeHoraTarefaInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadePontoFuncaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeServidorInvalidaException;

public class ProjetoTeste {

	public static void main(String[] args) {
		List<Tarefa> tarefas = new ArrayList<Tarefa>();		

		try {
			Analise analise = new Analise("Levantamento de requisitos", 8);
			analise.setQtdeHora(30);
			analise.setDiagramas(true);
			tarefas.add(analise);
		} catch (QuantidadeEntrevistasInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}

		try {
			Desenvolvimento desenvolvimento = new Desenvolvimento("Criação da camada de visão");
			desenvolvimento.setQtdeHora(75);
			desenvolvimento.setPontosFuncao(10);
			desenvolvimento.setTecnologiaPrincipal("java");
			tarefas.add(desenvolvimento);
		} catch (QuantidadePontoFuncaoInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}

		try {
			Implantacao implantacao = new Implantacao("Criação dos conteiners");
			implantacao.setQtdeHora(70);
			implantacao.setDevops(true);
			implantacao.setQtdeServidor(5);		
			tarefas.add(implantacao);
		} catch (QuantidadeServidorInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}		
		
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Moraes LTDA");
		empresa.setDiretor("Sr.Elberth");
		
		Projeto projeto = new Projeto("The Boss", empresa);
		projeto.setApresentacao("Projeto Final Java");
		projeto.setComplexidade(4);
		projeto.setTarefas(tarefas);
		
		System.out.println(projeto);
	}
}