package br.edu.infnet.testes;

import java.util.Scanner;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.dominio.Administrativo;
import br.edu.infnet.dominio.Funcionario;
import br.edu.infnet.dominio.Programador;

public class TP3Teste {
	
	private static Funcionario[] funcionarios;

	private static void impressao(int posicao) {		
		funcionarios[posicao].impressao();
	}

	public static void main(String[] args) {
		
		funcionarios = new Funcionario[Constante.QTDE];
		
		Scanner in = new Scanner(System.in);
		
		String opcao = null;

		int index = 0;
		
		do {
			System.out.println("[1] Cadastrar Administrativo");
			System.out.println("[2] Cadastrar Programador");
			System.out.println("[3] Consultar um");
			System.out.println("[4] Consultar todos");
			System.out.println("[9] Sair");
			System.out.print("Informe a op��o desejada: ");
			
			opcao = in.next();

			switch (opcao) {
			case "1":
				if(index < Constante.QTDE) {
					
					Administrativo adm = new Administrativo();
					
					System.out.println("Informe o seu nome: ");
					adm.setNome(in.next());
	
					System.out.println("Informe a sua idade: ");
					adm.setIdade(in.nextInt());
	
					System.out.println("Informe o seu sal�rio: ");
					adm.setSalario(in.nextFloat());
	
					System.out.println("Informe o seu b�nus: ");
					adm.setBonus(in.nextFloat());
	
					System.out.println("Informe o seu desconto: ");
					adm.setDesconto(in.nextFloat());
					
					funcionarios[index] = adm;
					
					System.out.println("-----------------------------------");
					System.out.println("Funcion�rio cadastrado com sucesso:");
					impressao(index);
					System.out.println("-----------------------------------");
					System.out.println("");
					
					index++;
				} else {
					System.out.println("-----------------------------------");
					System.out.println("Imposs�vel realizar o cadastramento!!!");
					System.out.println("-----------------------------------");
					System.out.println("");
				}
				break;
				
			case "2":
				if(index < Constante.QTDE) {
					
					Programador prog = new Programador();
					
					System.out.println("Informe o seu nome: ");
					prog.setNome(in.next());
	
					System.out.println("Informe a sua idade: ");
					prog.setIdade(in.nextInt());
	
					System.out.println("Informe o seu sal�rio: ");
					prog.setSalario(in.nextFloat());
	
					System.out.println("Informe se voc� � fullstack: ");
					prog.setFullstack(in.nextBoolean());
	
					System.out.println("Informe a sua linguagem: ");
					prog.setLinguagem(in.next());
					
					funcionarios[index] = prog;
					
					System.out.println("-----------------------------------");
					System.out.println("Funcion�rio cadastrado com sucesso:");
					impressao(index);
					System.out.println("-----------------------------------");
					System.out.println("");
					
					index++;
				} else {
					System.out.println("-----------------------------------");
					System.out.println("Imposs�vel realizar o cadastramento!!!");
					System.out.println("-----------------------------------");
					System.out.println("");
				}
				break;
				
			case "3":
				System.out.println("Informe o c�digo do funcion�rio: ");
				int codigo = in.nextInt();
								
				if(codigo >= 0 && codigo < index) {
					impressao(codigo);
				} else {
					System.out.println("-----------------------------------");
					System.out.println("Este c�digo n�o existe!!!");
					System.out.println("-----------------------------------");
					System.out.println("");
				}
				
				break;
				
			case "4":
				for(int i = 0;i<index;i++) {
					impressao(i);
				}
				break;
				
			case "9":
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Op��o inv�lida!!!");
				break;
			}
			
		} while (!"9".equals(opcao));
		
		System.out.println("Terminou!!!");
		
		in.close();
	}
}