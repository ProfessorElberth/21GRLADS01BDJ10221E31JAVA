package br.edu.infnet.dominio;

import br.edu.infnet.auxiliar.Constante;

public class Funcionario {
	public String nome;
	public int idade;
	public float salario;
	public float bonus;
	public float desconto;
	
	private int posicao;

	public Funcionario() {
		this.nome = "Fantasma";
	}

	public Funcionario(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}

	public Funcionario(String nome, int idade, float salario) {
		this(nome, idade);
		this.salario = salario;
	}

	private static String obterSituacao(float salarioLiquido) {
		String situacao = salarioLiquido > Constante.VALOR ? "rico" : "pobre";

		return situacao;
	}

	private float calcularSalarioLiquido() {
		return salario + bonus - desconto;
	}

	public void impressao() {

		float calculoSalarial = calcularSalarioLiquido();

		System.out.printf("[%d] %s - %d anos || R$%.2f : %s\n", 
				posicao, 
				nome, 
				idade,
				calculoSalarial, 
				obterSituacao(calculoSalarial)
			);
	}

	@Override
	public String toString() {
		return "Sou " + nome + ", tenho " + idade + " anos";
	}
}