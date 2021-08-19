package br.edu.infnet.dominio;

public class Programador {

	public String nome;
	public int idade;
	public float salario;
	public boolean fullstack;
	public String linguagem;
	
	public Programador(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Programador(String nome, int idade, float salario, boolean fullstack, String linguagem) {
		this(nome, idade);
		this.salario = salario;
		this.fullstack = fullstack;
		this.linguagem = linguagem;
	}
	
	@Override
	public String toString() {
		return "Sou o programador " + nome;
	}
}