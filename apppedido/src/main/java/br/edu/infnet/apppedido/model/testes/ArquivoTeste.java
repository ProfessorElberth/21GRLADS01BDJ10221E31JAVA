package br.edu.infnet.apppedido.model.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Produto;
import br.edu.infnet.apppedido.model.domain.Sobremesa;
import br.edu.infnet.apppedido.model.domain.Solicitante;
import br.edu.infnet.apppedido.model.exceptions.PesoZeradoException;
import br.edu.infnet.apppedido.model.exceptions.QuantidadeNegativaException;
import br.edu.infnet.apppedido.model.exceptions.TamanhoNegativoException;

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
				
				List<Produto> produtos = new ArrayList<Produto>();
				Pedido pedido = new Pedido();

				while(linha != null) {
					
					campos = linha.split(";");
					
					if(campos.length == 5) {
						Solicitante solicitante = new Solicitante(
								campos[2], 
								campos[3], 
								campos[4]
							);

						pedido.setDescricao(campos[0]);
						pedido.setWeb(Boolean.valueOf(campos[1]));
						pedido.setSolicitante(solicitante);
					} else {
						switch (campos[0]) {
						case "B":
							Bebida bebida = new Bebida(
									campos[1],
									Float.valueOf(campos[2]), 
									Integer.valueOf(campos[3])
								);
							try {
								bebida.setGelada(Boolean.valueOf(campos[4]));
								bebida.setTamanho(Float.valueOf(campos[5]));
								bebida.setMarca(campos[6]);
								
								produtos.add(bebida);
							} catch (NumberFormatException | TamanhoNegativoException e) {
								System.out.println(e.getMessage());
							}

							break;

						case "C":
							Comida comida = new Comida(
									campos[1],
									Float.valueOf(campos[2]), 
									Integer.valueOf(campos[3])
								);
							try {
								comida.setPeso(Float.valueOf(campos[4]));
								comida.setVegano(Boolean.valueOf(campos[5]));
								comida.setIngredientes(campos[6]);
								
								produtos.add(comida);
							} catch (NumberFormatException | PesoZeradoException e) {
								System.out.println(e.getMessage());
							}

							break;

						case "S":
							Sobremesa sobremesa = new Sobremesa(
									campos[1],
									Float.valueOf(campos[2]), 
									Integer.valueOf(campos[3])
								);
							try {
								sobremesa.setDoce(Boolean.valueOf(campos[4]));
								sobremesa.setInformacao(campos[5]);
								sobremesa.setQuantidade(Float.valueOf(campos[6]));
								
								produtos.add(sobremesa);
							} catch (NumberFormatException | QuantidadeNegativaException e) {
								System.out.println(e.getMessage());
							}	
							break;
							
						default:
							System.out.println("Pedido sem tipo!!!");
							break;
						}
					}					

					linha = leitura.readLine();
				}
				
				pedido.setProdutos(produtos);

				for(Produto prod : pedido.getProdutos()) {
					escrita.write(
							pedido.getDescricao()+";"+
							pedido.getSolicitante().getNome()+";"+
							prod.getNome()+";"+
							prod.calcularValorVenda()+"\r\n"
						);
				}

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
