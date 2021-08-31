package br.edu.infnet.dominio;

public class Programador extends Funcionario {

	private boolean fullstack;
	private String linguagem;
	
	public Programador() {
		this.setNome("Javeiro");
	}
	
	public Programador(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}

	public Programador(String nome, int idade, float salario, boolean fullstack, String linguagem) {
		this(nome, idade);
		this.setSalario(salario);
		this.fullstack = fullstack;
		this.linguagem = linguagem;
	}
	
	private float calcularSalarioFullstack() {
		return fullstack ? 1500 : 500;
	}
	
	private float calcularSalarioLinguagem() {
		return "java".equalsIgnoreCase(linguagem) ? 2000 : 750;
	}
	
	public float calcularSalarioLiquido() {		
		return getSalario() + calcularSalarioFullstack() + calcularSalarioLinguagem();
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
				getNome(), 
				getIdade(),
				calculoSalarial, 
				obterSituacao(calculoSalarial)
			);
	}
	
	@Override
 	public String toString() {
		return "Sou o programador " + getNome();
	}

	public boolean isFullstack() {
		return fullstack;
	}

	public void setFullstack(boolean fullstack) {
		this.fullstack = fullstack;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
}