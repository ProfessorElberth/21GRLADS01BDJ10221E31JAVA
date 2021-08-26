package br.edu.infnet.testes;

import java.util.Scanner;

import br.edu.infnet.auxiliar.Constante;

public class TP1Teste {
	
	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	private static float[] bonus;
	private static float[] descontos;

	private static void impressao(int posicao) {
		
		float calculoSalarial = calcularSalarioLiquido(posicao);
		
		System.out.printf("[%d] %s - %d anos || R$%.2f : %s\n", 
				posicao, 
				nomes[posicao], 
				idades[posicao], 
				calculoSalarial, 
				obterSituacao(calculoSalarial)
			);
	}
	
	private static String obterSituacao(float salarioLiquido) {
		String situacao = salarioLiquido > Constante.VALOR ? "rico" : "pobre";

		return situacao;
	}
	
	private static float calcularSalarioLiquido(int posicao) {
		return salarios[posicao] + bonus[posicao] - descontos[posicao];
	}
	
	public static void main(String[] args) {
		nomes = new String[Constante.QTDE];
		idades = new int[Constante.QTDE];
		salarios = new float[Constante.QTDE];
		bonus = new float[Constante.QTDE];
		descontos = new float[Constante.QTDE];
		
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
				if(index < Constante.QTDE) {
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
					
					System.out.println("-----------------------------------");
					System.out.println("Funcionário cadastrado com sucesso:");
					impressao(index);
					System.out.println("-----------------------------------");
					System.out.println("");
					
					index++;
				} else {
					System.out.println("-----------------------------------");
					System.out.println("Impossível realizar o cadastramento!!!");
					System.out.println("-----------------------------------");
					System.out.println("");
				}
				break;
			case "2":
				System.out.println("Informe o código do funcionário: ");
				int codigo = in.nextInt();
								
				if(codigo >= 0 && codigo < index) {
					impressao(codigo);
				} else {
					System.out.println("-----------------------------------");
					System.out.println("Este código não existe!!!");
					System.out.println("-----------------------------------");
					System.out.println("");
				}
				
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