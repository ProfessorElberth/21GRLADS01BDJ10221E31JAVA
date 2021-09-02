package br.edu.infnet.testes;

import br.edu.infnet.dominio.Empresa;

public class EmpresaTeste {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		empresa.setNome("Pedro Álvares cabral");
		empresa.impressao();
	}
}