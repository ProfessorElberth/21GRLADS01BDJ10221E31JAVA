package br.edu.infnet.testes;

import br.edu.infnet.dominio.Administrativo;

public class AdministrativoTeste {

	public static void main(String[] args) {
		
		Administrativo adm1 = new Administrativo();
		adm1.setNome("joao");
		adm1.setIdade(18);
		adm1.setSalario(500);
		adm1.setBonus(100);
		adm1.setDesconto(50);		
		adm1.impressao();
	}
}
