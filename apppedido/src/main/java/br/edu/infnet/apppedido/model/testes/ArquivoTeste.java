package br.edu.infnet.apppedido.model.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Solicitante;

public class ArquivoTeste {

	public static void main(String[] args) {
		
		String dir = "C:/dev/";
		String arq = "pedidos.txt";
		
		try {
			
			try {
				FileReader file = new FileReader(dir+arq);				
				BufferedReader leitura = new BufferedReader(file);
				
				FileWriter fileW = new FileWriter(dir+"out_"+arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				String linha = null;
				String[] campos;
				
				linha = leitura.readLine();

				while(linha != null) {
					
					campos = linha.split(";");
					
					if(campos.length == 5) {
						Solicitante solicitante = new Solicitante(
								campos[2], 
								campos[3], 
								campos[4]
							);

						Pedido pedido = new Pedido();
						pedido.setDescricao(campos[0]);
						pedido.setWeb(Boolean.valueOf(campos[1]));
						pedido.setSolicitante(solicitante);
						
						System.out.println(pedido);
					} else {
						switch (campos[0]) {
						case "B":
							Bebida bebida = new Bebida(
									campos[1],
									Float.valueOf(campos[2]), 
									Integer.valueOf(campos[3])
								);

							break;

						case "C":
							Comida comida = new Comida(
									campos[1],
									Float.valueOf(campos[2]), 
									Integer.valueOf(campos[3])
								);

							break;

						case "S":
							//TODO Implementar a classe de sobremesa
//							Sobremesa sobremesa = new Sobremesa(
//									campos[1],
//									Float.valueOf(campos[2]), 
//									Integer.valueOf(campos[3])
//								);
							break;
							
						default:
							System.out.println("Pedido sem tipo!!!");
							break;
						}
					}					

					linha = leitura.readLine();
				}
				
//				escrita.write(qtde+";"+somaSalarial+"\r\n");

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
