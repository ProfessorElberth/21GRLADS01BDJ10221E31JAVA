package br.edu.infnet.testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import br.edu.infnet.dominio.Programador;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/";
		String arq = "funcionarios.txt";
		
		try {
			
			try {
				FileReader file = new FileReader(dir+arq);				
				BufferedReader leitura = new BufferedReader(file);
				
				String linha = null;
				String[] campos;
				
				linha = leitura.readLine();
				
				
				
				while(linha != null) {
					
					campos = linha.split(";");

					Programador prog1 = new Programador();
					prog1.setNome(campos[1]);
					prog1.impressao();

					linha = leitura.readLine();
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
