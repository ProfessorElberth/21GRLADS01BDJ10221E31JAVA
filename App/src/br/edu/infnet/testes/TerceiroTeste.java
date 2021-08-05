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

//passo 3: atribuir valores ao vetor
//nomes[0] = "Elberth";
//nomes[1] = "Lins";
//nomes[2] = "Costa";
//nomes[3] = "de";
//nomes[4] = "Moraes";

//passo 4: leitura do vetor
//System.out.println("Aluno: " + nomes[0]);
//System.out.println(Arrays.asList(nomes));

//for (String nome : nomes) {
//	System.out.println("Aluno: " + nome);
//}

//for (int i = 0; i < nomes.length; i++) {
//	System.out.println("Aluno: " + nomes[i]);
//}
