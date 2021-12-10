package br.edu.infnet.AppFinal.model.tests;

import br.edu.infnet.AppFinal.model.domain.Empresa;

public class EmpresaTeste {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Moraes LTDA");
		empresa.setDiretor("Sr.Elberth");
		System.out.println(empresa);
	}
}
