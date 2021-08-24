package br.edu.infnet.testes;

import br.edu.infnet.dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {
		
		Programador prog1 = new Programador();
		prog1.nome = "maria";
		prog1.idade = 20;
		prog1.fullstack = true;
		prog1.linguagem = "python";
		prog1.salario = 2000;
		prog1.impressao();

		Programador programador = new Programador("zezinho", 40);
		programador.fullstack = false;
		programador.linguagem = "java";
		programador.salario = 999;
		programador.impressao();
	}
}
