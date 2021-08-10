package br.edu.infnet.testes;

import java.util.Scanner;

public class TerceiroTeste {
	
	private static String[] nomes;

	private final static int QTDE_ALUNOS = 10;
	
	private static void impressao(){
		System.out.println("Nomes cadastrados: ");
		for(String nome: nomes) {
			System.out.println("Aluno: " + nome);
		}		
	}
	
	public static void main(String[] args) {

		int qtde = Integer.valueOf(args[0]);

		if(qtde < QTDE_ALUNOS) {
			nomes = new String[qtde];
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("[1] Cadastrar");
			System.out.println("[2] Consultar um");
			System.out.println("[3] Consultar todos");
			System.out.println("[4] Sair");
			System.out.print("Informe a opção desejada: ");
			
			int opcao = in.nextInt();

			for(int i = 0 ; i<qtde ; i++) {
				System.out.println("Informe o seu nome: ");
				nomes[i] = in.next();
			}

			in.close();

			System.out.println("Quantidade: " + qtde);
			
			impressao();
		} else {
			System.out.println("Esta quantidade é superior ao número máximo!!!");
		}
	}
}