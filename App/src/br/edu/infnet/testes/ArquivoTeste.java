package br.edu.infnet.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.dominio.Administrativo;
import br.edu.infnet.dominio.Programador;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/";
		String arq = "funcionarios.txt";
		
		try {
			
			try {
				FileReader file = new FileReader(dir+arq);				
				BufferedReader leitura = new BufferedReader(file);
				
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = null;
				String[] campos;
				
				linha = leitura.readLine();
				
				int qtde = 0;
				float somaSalarial = 0;
				
				while(linha != null) {
					
					campos = linha.split(";");
					
					switch (campos[0]) {
					case "A":
						Administrativo adm = new Administrativo();
						
						adm.setBonus(Float.valueOf(campos[4]));
						adm.setDesconto(Float.valueOf(campos[5]));
						adm.setIdade(Integer.valueOf(campos[2]));
						adm.setNome(campos[1]);
						adm.setSalario(Float.valueOf(campos[3]));
						
						escrita.write(adm.obterStringSalarioPorFuncionario());
						
						somaSalarial = somaSalarial + adm.calcularSalarioLiquido();
						
						qtde++;
						
						break;

					case "P":
						Programador prog = new Programador();
						
						prog.setFullstack(Boolean.valueOf(campos[4]));
						prog.setIdade(Integer.valueOf(campos[2]));
						prog.setLinguagem(campos[5]);
						prog.setNome(campos[1]);
						prog.setSalario(Float.valueOf(campos[3]));
						
						escrita.write(prog.obterStringSalarioPorFuncionario());

						somaSalarial = somaSalarial + prog.calcularSalarioLiquido();
						
						qtde++;

						break;

					default:
						System.out.println("Funcionário sem tipo!!!");
						break;
					}

					linha = leitura.readLine();
				}
				
				escrita.write(qtde+";"+somaSalarial+"\r\n");

				leitura.close();
				file.close();
				
				escrita.close();
				fileW.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		} finally {
			System.out.println("Processamento realizado!!!");
		}
	}
}
