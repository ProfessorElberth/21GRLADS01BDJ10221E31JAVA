package br.edu.infnet.dominio;

public class Programador extends Funcionario {

	public boolean fullstack;
	public String linguagem;
	
	private int posicao;
	
	public Programador() {
		this.nome = "Javeiro";
	}
	
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
	
	private float calcularSalarioFullstack() {
		return fullstack ? 1500 : 500;
	}
	
	private float calcularSalarioLinguagem() {
		return "java".equalsIgnoreCase(linguagem) ? 2000 : 750;
	}
	
	private float calcularSalarioLiquido() {		
		return salario + calcularSalarioFullstack() + calcularSalarioLinguagem();
	}
	
	private static String obterSituacao(float salarioLiquido) {
		String situacao = null;
		
		if(salarioLiquido < 50) {
			situacao = "pobre";
		}else if (salarioLiquido > 100) {
			situacao = "rico";
		}else {
			situacao = "classe media";
		}

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
		return "Sou o programador " + nome;
	}
}