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
		sexo = argumentos[6];
	}

	public static void main(String[] args){	
		System.out.println("Hello, World");

		if(validar(args.length)){
			
			tratarParametros(args);

			int anoNascimento = calcularAnoNascimento(idade);
			float salarioTotal = calcularSalarioTotal(salario, qtdeMes);			
			String situacao = definirSituacao(idade);
			String status = definirStatus(salarioTotal);

			System.out.println("Nome: " + nome);
			System.out.println("Sobrenome: " + sobrenome);
			System.out.println("Idade: " + idade);
			System.out.println("Ano de nascimento: " + anoNascimento);
			System.out.println("Salario mensal: " + salario);
			System.out.println("Recebimentos: " + salarioTotal);
			System.out.println("Devjava: " + java);
			System.out.println("Situacao: " + situacao);
			System.out.println("Status: " + status);			
		} else {
			System.out.println("Deu ruim");
		}
	}
}