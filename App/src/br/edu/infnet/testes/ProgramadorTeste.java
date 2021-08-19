package br.edu.infnet.testes;

import br.edu.infnet.dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {
		
		Programador programador = new Programador("zezinho", 40);
		programador.fullstack = false;
		programador.linguagem = "java";
		programador.salario = 999;
		System.out.println("Programador: " + programador);
	}
}
