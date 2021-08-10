package br.edu.infnet.testes;

import java.util.Scanner;

public class TPTeste {
	
	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	private static float[] bonus;
	private static float[] descontos;

	private final static int QTDE_ALUNOS = 10;
	
	private static void impressao(int posicao){
		System.out.printf("[%d] %s - %d anos - R$%.2f\n", 
				posicao, nomes[posicao], idades[posicao], salarios[posicao]);
	}
	
	public static void main(String[] args) {
		nomes = new String[QTDE_ALUNOS];
		idades = new int[QTDE_ALUNOS];
		salarios = new float[QTDE_ALUNOS];
		bonus = new float[QTDE_ALUNOS];
		descontos = new float[QTDE_ALUNOS];
		
		Scanner in = new Scanner(System.in);
		
		String opcao = null;

		int index = 0;
		
		do {
			System.out.println("[1] Cadastrar");
			System.out.println("[2] Consultar um");
			System.out.println("[3] Consultar todos");
			System.out.println("[4] Sair");
			System.out.print("Informe a opção desejada: ");
			
			opcao = in.next();

			switch (opcao) {
			case "1":

				System.out.println("Informe o seu nome: ");
				nomes[index] = in.next();

				System.out.println("Informe a sua idade: ");
				idades[index] = in.nextInt();

				System.out.println("Informe o seu salário: ");
				salarios[index] = in.nextFloat();

				System.out.println("Informe o seu bônus: ");
				bonus[index] = in.nextFloat();

				System.out.println("Informe o seu desconto: ");
				descontos[index] = in.nextFloat();

				index++;

				break;
			case "2":
				System.out.println("Informe o código do funcionário: ");
				int codigo = in.nextInt();

				impressao(codigo);
				break;
				
			case "3":
				for(int i = 0;i<index;i++) {
					impressao(i);
				}
				break;
				
			case "4":
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida!!!");
				break;
			}
			
		} while (!"4".equals(opcao));
		
		System.out.println("Terminou!!!");
		
		in.close();
	}
}