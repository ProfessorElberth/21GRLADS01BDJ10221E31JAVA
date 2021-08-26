package br.edu.infnet.testes;

import br.edu.infnet.dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {
		
		Programador prog1 = new Programador();
		prog1.setNome("maria");
		prog1.setIdade(20);
		prog1.setFullstack(true);
		prog1.setLinguagem("python");
		prog1.setSalario(2000);
		prog1.impressao();

		Programador programador = new Programador("jOs…", 40);
		programador.setFullstack(false);
		programador.setLinguagem("java");
		programador.setSalario(999);
		programador.impressao();
	}
}