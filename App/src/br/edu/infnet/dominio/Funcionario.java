package br.edu.infnet.dominio;

import br.edu.infnet.auxiliar.Constante;

public abstract class Funcionario {
	private String nome;
	private int idade;
	private float salario;
	
	private int posicao;

	public Funcionario() {
		this.nome = "Fantasma";
		this.idade = 18;
		this.salario = 1045;
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
	
	public abstract float calcularSalarioLiquido();

	private static String obterSituacao(float salarioLiquido) {
		String situacao = salarioLiquido > Constante.VALOR ? "rico" : "pobre";

		return situacao;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}