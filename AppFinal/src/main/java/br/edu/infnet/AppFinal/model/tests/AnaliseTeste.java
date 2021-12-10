package br.edu.infnet.AppFinal.model.tests;

import br.edu.infnet.AppFinal.model.domain.Analise;
import br.edu.infnet.AppFinal.model.exceptions.DescricaoInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeEntrevistasInvalidaException;
import br.edu.infnet.AppFinal.model.exceptions.QuantidadeHoraTarefaInvalidaException;

public class AnaliseTeste {

	public static void main(String[] args) {
		
		try {
			//caso de sucesso
			Analise a1 = new Analise("Levantamento de requisitos", 8);
			a1.setQtdeHora(30);
			a1.setDiagramas(true);
			System.out.println("Valor: " + a1.calcularValor());
		} catch (QuantidadeEntrevistasInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}

		try {
			//descricao invalida
			Analise a2 = new Analise(null, 8);
			a2.setQtdeHora(30);
			a2.setDiagramas(true);
			System.out.println("Valor: " + a2.calcularValor());
		} catch (QuantidadeEntrevistasInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//quantidade de entrevistas zerada
			Analise a3 = new Analise("Levantamento de requisitos", 0);
			a3.setQtdeHora(30);
			a3.setDiagramas(true);
			System.out.println("Valor: " + a3.calcularValor());
		} catch (QuantidadeEntrevistasInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}

		try {
			//quantidade de entrevistas negativa
			Analise a4 = new Analise("Levantamento de requisitos", -4);
			a4.setQtdeHora(30);
			a4.setDiagramas(true);
			System.out.println("Valor: " + a4.calcularValor());
		} catch (QuantidadeEntrevistasInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}

		try {
			//quantidade de horas zerada
			Analise a5 = new Analise("Levantamento de requisitos", 8);
			a5.setQtdeHora(0);
			a5.setDiagramas(true);
			System.out.println("Valor: " + a5.calcularValor());
		} catch (QuantidadeEntrevistasInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}

		try {
			//quantidade de horas negativa
			Analise a6 = new Analise("Levantamento de requisitos", 8);
			a6.setQtdeHora(-10);
			a6.setDiagramas(true);
			System.out.println("Valor: " + a6.calcularValor());
		} catch (QuantidadeEntrevistasInvalidaException | DescricaoInvalidaException | QuantidadeHoraTarefaInvalidaException e) {
			System.out.println(e.getMessage());
		}
	}
}
