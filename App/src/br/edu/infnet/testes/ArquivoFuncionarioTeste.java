package br.edu.infnet.testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArquivoFuncionarioTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/";
		String arq = "out_funcionarios.txt";
		
		String[] mensagens = new String[7];

		//TODO Apresentar o conceito de List

		try {
			
			try {
				FileReader file = new FileReader(dir+arq);				
				BufferedReader leitura = new BufferedReader(file);

				String linha = null;
				String[] campos;
				
				linha = leitura.readLine();
				
				int index = 0;
				
				while(linha != null) {
					
					campos = linha.split(";");
					
					//TODO Validação

					mensagens[index++] = String.format("O funcionário %s recebe %.2f", campos[0], Float.valueOf(campos[1]));

					//TODO Lançar exception
					
					linha = leitura.readLine();
				}
				
				//TODO Tratar exception

				for(String msg : mensagens) {
					System.out.println(msg);
				}
				
				leitura.close();
				file.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		} finally {
			System.out.println("Processamento realizado!!!");
		}
		
	}
}
