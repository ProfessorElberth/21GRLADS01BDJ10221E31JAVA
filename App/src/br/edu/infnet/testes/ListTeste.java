package br.edu.infnet.testes;

import java.util.ArrayList;
import java.util.List;

public class ListTeste {

	public static void main(String[] args) {
		
		//criação: definição + instância
		String[] nomes = new String[2];
		List<String> lista = new ArrayList<String>();
		
		//inclusão
		nomes[0] = "Elberth";
		nomes[1] = "Moraes";
		
		lista.add("Joao");
		lista.add("Hugo");
		lista.add("Luiz");
		
		//leitura individual
		System.out.println(nomes[0]);
		System.out.println(lista.get(0));
		
		//leitura em grupo
		for(String nome : lista) {
			System.out.println(nome);
		}
	}
}