public class PrimeiroTeste {
	
	private static boolean validar(int qtde){
		return qtde == 6;
	}

	public static void main(String[] args){	
		System.out.println("Hello, World");

		if(validar(args.length)){

			String nome = args[0];
			String sobrenome = args[1];
			int idade = Integer.valueOf(args[2]);
			float salario = Float.valueOf(args[3]);
			boolean java = Boolean.valueOf(args[4]);
			int qtdeMes = Integer.valueOf(args[5]);

			int anoNascimento = 2021 - idade;
			float salarioTotal = salario * qtdeMes;
			
			String situacao = "Veterano";
			if(idade < 50){
				situacao = "Iniciante";
			}

			String status = "Instavel";
			if(salarioTotal > 1000){
				status = "Estavel";
			}

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