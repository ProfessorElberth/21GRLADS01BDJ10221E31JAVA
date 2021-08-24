package br.edu.infnet.testes;

import br.edu.infnet.dominio.Administrativo;

public class AdministrativoTeste {

	public static void main(String[] args) {
		
		Administrativo adm1 = new Administrativo();
		adm1.nome = "joao";
		adm1.idade = 18;
		adm1.salario = 500;
		adm1.bonus = 100;
		adm1.desconto = 50;
		adm1.impressao();
	}
}
