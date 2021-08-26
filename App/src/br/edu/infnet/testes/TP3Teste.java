package br.edu.infnet.testes;

import java.util.Scanner;

import br.edu.infnet.auxiliar.Constante;
import br.edu.infnet.dominio.Administrativo;

public class TP3Teste {
	
	private static Administrativo[] administrativos;

	private static void impressao(int posicao) {
		
		float calculoSalarial = calcularSalarioLiquido(posicao);
		
		System.out.printf("[%d] %s - %d anos || R$%.2f : %s\n", 
				posicao, 
				administrativos[posicao].getNome(), 
				administrativos[posicao].getIdade(), 
				calculoSalarial, 
				obterSituacao(calculoSalarial)
			);
	}
	
	private static String obterSituacao(float salarioLiquido) {
		String situacao = salarioLiquido > Constante.VALOR ? "rico" : "pobre";

		return situacao;
	}
	
	private static float calcularSalarioLiquido(int posicao) {
		return administrativos[posicao].getSalario() + 
			   administrativos[posicao].getBonus() - 
			   administrativos[posicao].getDesconto();
	}
	
	public static void main(String[] args) {
		
		administrativos = new Administrativo[Constante.QTDE];
		
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
					
					Administrativo adm = new Administrativo();
					
					System.out.println("Informe o seu nome: ");
					adm.setNome(in.next());
	
					System.out.println("Informe a sua idade: ");
					adm.setIdade(in.nextInt());
	
					System.out.println("Informe o seu salário: ");
					adm.setSalario(in.nextFloat());
	
					System.out.println("Informe o seu bônus: ");
					adm.setBonus(in.nextFloat());
	
					System.out.println("Informe o seu desconto: ");
					adm.setDesconto(in.nextFloat());
					
					administrativos[index] = adm;
					
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