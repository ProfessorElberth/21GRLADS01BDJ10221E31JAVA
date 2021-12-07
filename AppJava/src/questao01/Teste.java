package questao01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Teste {
	
	static Map<Integer, Reuniao> reunioes = new HashMap<Integer, Reuniao>();
	
	private static void prepararReunioes(String arquivo) {

		try {
			FileReader file = new FileReader(arquivo);				
			BufferedReader leitura = new BufferedReader(file);

			String linha = null;
			String[] campos;

			linha = leitura.readLine();
			
			while(linha != null) {
				
				campos = linha.split(" ");
				
				Reuniao reuniao = new Reuniao();
				reuniao.id = Integer.valueOf(campos[0]);
				reuniao.dia = Integer.valueOf(campos[1]);
				reuniao.mes = Integer.valueOf(campos[2]);
				reuniao.ano = Integer.valueOf(campos[3]);
				reuniao.hora = Integer.valueOf(campos[4]);
				reuniao.min = Integer.valueOf(campos[5]);
				reuniao.qtd_pessoas = Integer.valueOf(campos[6]);
				
				reunioes.put(reuniao.id, reuniao);
				
				linha = leitura.readLine();
			}

			leitura.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void atualizaArquivo(String dir, String arq) {
		try {
			FileWriter fileW = new FileWriter(dir+"atual_"+arq);
			BufferedWriter escrita = new BufferedWriter(fileW);

			for(Reuniao r : reunioes.values()) {
				escrita.write(r.linhaGravacao());
			}
			
			escrita.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}		
		
	}
	
	public static void main(String[] args) {
		String dir = "C:/dev/";
		String arqReuniao = "reunioes.txt";
		String arqOperacao = "operacoes.txt";
		
		try {
			
			try {
				
				prepararReunioes(dir+arqReuniao);

				FileReader file= new FileReader(dir+arqOperacao);				
				BufferedReader leitura = new BufferedReader(file);

				String linha = null;
				String[] campos;
				
				linha = leitura.readLine();
				
				while(linha != null) {
					
					campos = linha.split(" ");

					String operacao = campos[1];
					
					switch (operacao) {
					case "I":
						Reuniao reuniaoincluida = reunioes.get(Integer.valueOf(campos[0]));
						
						if(reuniaoincluida != null) {
							System.err.println(linha);
						} else {
							Reuniao reuniao = new Reuniao();
							reuniao.id = Integer.valueOf(campos[0]);
							reuniao.dia = Integer.valueOf(campos[2]);
							reuniao.mes = Integer.valueOf(campos[3]);
							reuniao.ano = Integer.valueOf(campos[4]);
							reuniao.hora = Integer.valueOf(campos[5]);
							reuniao.min = Integer.valueOf(campos[6]);
							reuniao.qtd_pessoas = Integer.valueOf(campos[7]);
							
							reunioes.put(reuniao.id, reuniao);
						}
						
						break;

					case "M":
						Reuniao reuniaoAlterada = reunioes.get(Integer.valueOf(campos[0]));
						
						if(reuniaoAlterada == null) {
							System.err.println(linha);
						} else {
							switch (campos[2]) {
							case "DIA":
								reuniaoAlterada.dia = Integer.valueOf(campos[3]);
								break;
							case "MES":
								reuniaoAlterada.mes = Integer.valueOf(campos[3]);
								break;
							case "ANO":
								reuniaoAlterada.ano = Integer.valueOf(campos[3]);
								break;
							case "HORA":
								reuniaoAlterada.hora = Integer.valueOf(campos[3]);
								break;
							case "MIN":
								reuniaoAlterada.min = Integer.valueOf(campos[3]);
								break;
							case "QTD":
								reuniaoAlterada.qtd_pessoas = Integer.valueOf(campos[3]);
								break;

							default:
								break;
							}
							reunioes.put(reuniaoAlterada.id, reuniaoAlterada);							
						}
						break;

					case "E":

						Reuniao reuniaoRemovida = reunioes.remove(Integer.valueOf(campos[0]));
						
						if(reuniaoRemovida == null) {
							System.err.println(linha);
						}
						
						break;
					default:
						break;
					}

					linha = leitura.readLine();
				}
	
				atualizaArquivo(dir, arqReuniao);
				
				leitura.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} finally {
			System.out.println("Processamento realizado com sucesso!");
		}
	}
}