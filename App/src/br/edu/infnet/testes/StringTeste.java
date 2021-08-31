package br.edu.infnet.testes;

public class StringTeste {

	public static void main(String[] args) {
		
		String nome = "Elberth Moraes";
		
		System.out.println("Nome: " + nome);
		
		System.out.println("Nome: " + nome.charAt(0));
		
		String nomeUp = nome.toUpperCase();
		
		System.out.println("Nome: " + nome.toUpperCase());
		
		System.out.println("Nome: " + nome);
		
		System.out.println("Nome: " + nomeUp);
		
		if(nome.equalsIgnoreCase(nomeUp)) {//estas das variáveis têm o mesmo valor?
			System.out.println("V");//V
		} else {
			System.out.println("F");//J
		}

		System.out.println("Nome: " + nomeUp.toUpperCase());
		
		System.out.println("Nome: " + nomeUp.toLowerCase());
		
		System.out.println("Nome: " + nomeUp);
	}
}