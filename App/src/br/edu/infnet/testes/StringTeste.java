package br.edu.infnet.testes;

public class StringTeste {

	public static void main(String[] args) {
		
//		String nome = " Elberth Moraes ";
		
		String nome = "Francisca";
		
		System.out.println("Nome: [" + nome.trim() + "]");		
		
		System.out.println("Primeiras 5 letras do usuário: " + nome.trim().substring(0, 5));
		
		//nome.substring(0, 5) =  Elbe 
		
		// " Elbe".trim() = "Elbe" 
		
		// " Elberth Moraes ".trim() = "Elberth Moraes"
		
		// "Elberth Moraes".substring(0, 5) = "Elber" 
	}
}

//
//System.out.println("Nome: " + nome.charAt(0));
//
//String nomeUp = nome.toUpperCase();
//
//System.out.println("Nome: " + nome.toUpperCase());
//
//System.out.println("Nome: " + nome);
//
//System.out.println("Nome: " + nomeUp);
//
//if(nome.equalsIgnoreCase(nomeUp)) {
//	System.out.println("V");
//} else {
//	System.out.println("F");
//}
//
//System.out.println("Nome: " + nomeUp.toUpperCase());
//
//System.out.println("Nome: " + nomeUp.toLowerCase());
//
//System.out.println("Nome: " + nomeUp);
//System.out.println("Nome: " + nome.indexOf("r"));		
//System.out.println("Nome: " + nome.lastIndexOf("r"));		
//System.out.println("Nome: " + nome.indexOf(" "));		
//System.out.println("Nome: " + nome.lastIndexOf(" "));

//System.out.println("Nome: " + nome.substring(3));		
//System.out.println("Nome: " + nome.substring(3, 11));		
//System.out.println("Nome: " + nome.substring(0, 5)); 		
//System.out.println("Nome: " + nome.substring(8, 15));

