package br.edu.infnet.testes;

import java.util.Scanner;

public class SegundoTeste {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		String nome = in.next();
		
		System.out.println("Informe a sua idade: ");		
		int idade = in.nextInt();
		
		System.out.println("Informe o seu salario: ");
		float salario = in.nextFloat();
		
		int quantidade = Integer.valueOf(args[0]);
		
		if(quantidade % 2 == 0){		
			System.out.println("Numero par: " + quantidade);
		} else {		
			System.out.println("Numero impar: " + quantidade);
		}
		
		//FOR: 
		for(int i = 0;i < quantidade;i++){
			System.out.println("FOR: " + nome +" - "+ idade +" - "+ salario);
		}
		
		//WHILE: 
		int a = 0;
		while(a < quantidade){
			System.out.println("WHILE: " + nome +" - "+ idade +" - "+ salario);
			a++;
		}
		
		//DOWHILE: 
		int b = 0;
		do{
			System.out.println("DOWHILE: " + nome +" - "+ idade +" - "+ salario);
			b++;
		}while(b < quantidade);
		
		in.close();
	}
}