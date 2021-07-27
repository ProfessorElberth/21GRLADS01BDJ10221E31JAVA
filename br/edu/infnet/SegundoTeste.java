package br.edu.infnet;

public class SegundoTeste {
	
	public static void main(String[] args){
		
		float quantidade = Float.valueOf(args[0]);
		
		if(quantidade % 2 == 0){		
			System.out.println("Numero par: " + quantidade);
		} else {		
			System.out.println("Numero impar: " + quantidade);
		}
	}
}