package br.com.infnet.review.model.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.com.infnet.review.model.domain.Movel;
import br.com.infnet.review.model.exceptions.TamanhoIncorretoException;

public class ArquivoMovel {

	public static void main(String[] args) {
		
		String dir = "c:/dev/";
		String arq = "moveis.txt";
		
		try {
			try {
				FileReader fileI = new FileReader(dir+arq);
				BufferedReader leitura = new BufferedReader(fileI);
				FileWriter fileO = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileO);
				
				String linha = leitura.readLine();
				String[] campos = null;
				
				while(linha != null) {
					campos = linha.split(";");
					
					try {
						Movel movel = new Movel();
						movel.setDescricao(campos[2]);
						movel.setQtdeGaveta(Integer.valueOf(campos[3]));
						movel.setRoda(Boolean.valueOf(campos[0]));
						movel.setTamanho(Float.valueOf(campos[1]));
						movel.impressao();
						escrita.write(movel.getDescricao()+";"+movel.calcularValorVenda()+"\r\n");
					} catch (NumberFormatException | TamanhoIncorretoException e) {
						System.out.println(e.getMessage());
					}

					linha = leitura.readLine();
				}
	
				leitura.close();
				fileI.close();
				escrita.close();
				fileO.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} finally {
			System.out.println("Processamento foi realizado com sucesso!");
		}
	}
}
