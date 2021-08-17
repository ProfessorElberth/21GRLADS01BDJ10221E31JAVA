package br.edu.infnet.testes;

public class Funcionario {
	String nome;
	int idade;
	float salario;
	float bonus;
	float desconto;

	Funcionario(){
		this.nome = "Fantasma";
	}	
	Funcionario(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}
	Funcionario(String nome, int idade, float salario){
		this(nome, idade);
		this.salario = salario;
	}
	
	void impressao(){
		System.out.println("Funcionário: " + this);
	}
	
	@Override
	public String toString() {
		return "Sou " + nome + ", tenho "+ idade +" anos";
	}
}