package br.edu.infnet.testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.exceptions.ArquivoCorrompidoException;

public class ArquivoFuncionarioTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/";
		String arq = "out_funcionarios.txt";
		
		List<String> mensagens = new ArrayList<String>();

		try {
			
			try {
				FileReader file = new FileReader(dir+arq);				
				BufferedReader leitura = new BufferedReader(file);

				String linha = null;
				String[] campos;
				
				linha = leitura.readLine();
				
				int qtdeTotal = 0;
				float valorTotal = 0;
				int qtde = 0;
				float valor = 0;
				
				while(linha != null) {
					
					campos = linha.split(";");
					
					try {
						qtdeTotal = Integer.valueOf(campos[0]);
						valorTotal = Float.valueOf(campos[1]);
					} catch (NumberFormatException e) {
						qtde++;
						valor = valor + Float.valueOf(campos[1]);
						mensagens.add(String.format("O funcionário %s recebe %.2f", campos[0], Float.valueOf(campos[1])));
					}

					linha = leitura.readLine();
				}
				
				if(qtdeTotal != qtde || valorTotal != valor) {
					throw new ArquivoCorrompidoException("Arquivo Corrompido");
				}

				for(String msg : mensagens) {
					System.out.println(msg);
				}
				
				leitura.close();
				file.close();
			} catch (ArquivoCorrompidoException | IOException e) {
				System.out.println(e.getMessage());
			}
			
		} finally {
			System.out.println("Processamento realizado!!!");
		}
		
	}
}
