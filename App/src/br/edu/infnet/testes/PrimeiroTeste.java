package br.edu.infnet.testes;

public class PrimeiroTeste {

	private static String nome;
	private static String sobrenome;
	private static int idade;
	private static float salario;
	private static boolean java;
	private static int qtdeMes;
	
	private static boolean validar(int qtde){
		return qtde == 6;
	}
	
	private static int calcularAnoNascimento(int idade){
		return 2021 - idade;
	}	
	
	private static float calcularSalarioTotal(float salario, int qtdeMes){
		return salario * qtdeMes;
	}
	
	private static String definirSituacao(int idade){		
		return idade < 50 ? "Iniciante" : "Veterano";
	}
	
	private static String definirStatus(float salarioTotal){		
		return salarioTotal > 1000 ? "Estavel" : "Instavel";
	}
	
	private static void tratarParametros(String[] argumentos){
		nome = argumentos[0];
		sobrenome = argumentos[1];
		idade = Integer.valueOf(argumentos[2]);
		salario = Float.valueOf(argumentos[3]);
		java = Boolean.valueOf(argumentos[4]);
		qtdeMes = Integer.valueOf(argumentos[5]);
	}
	
	private static void impressao(){
		float salarioTotal = calcularSalarioTotal(salario, qtdeMes);
		
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
		System.out.println("Idade: " + idade);
		System.out.println("Ano de nascimento: " + calcularAnoNascimento(idade));
		System.out.println("Salario mensal: " + salario);
		System.out.println("Recebimentos: " + salarioTotal);
		System.out.println("Devjava: " + java);
		System.out.println("Situacao: " + definirSituacao(idade));
		System.out.println("Status: " + definirStatus(calcularSalarioTotal(salario, qtdeMes)));
	}

	public static void main(String[] args){	
		System.out.println("Hello, World");

		if(validar(args.length)){
			
			tratarParametros(args);
			
			impressao();
		} else {
			System.out.println("Deu ruim");
		}
	}
}