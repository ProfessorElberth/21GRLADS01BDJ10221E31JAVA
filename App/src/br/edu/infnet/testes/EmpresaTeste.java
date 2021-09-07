package br.edu.infnet.testes;

import br.edu.infnet.dominio.Empresa;
import br.edu.infnet.exceptions.FaturamentoInvalidoException;
import br.edu.infnet.exceptions.NomeIncompletoException;

public class EmpresaTeste {

	public static void main(String[] args) {
		
		Empresa emp1 = new Empresa();
		emp1.setNome("Pedro Álvares cabral");
		try {
			emp1.setFaturamento(100);
			emp1.impressao();
		} catch (FaturamentoInvalidoException | NomeIncompletoException e) {
			System.out.println(e.getMessage());
		}
		
		Empresa emp2 = new Empresa();
		emp2.setNome("Pedro cabral");
		try {
			emp2.setFaturamento(0);
			emp2.impressao();
		} catch (FaturamentoInvalidoException | NomeIncompletoException e) {
			System.out.println(e.getMessage());
		}

		Empresa emp3 = new Empresa();
		try {
			emp3.setFaturamento(200);
			emp3.impressao();
		} catch (FaturamentoInvalidoException | NomeIncompletoException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Empresa emp4 = new Empresa();
			emp4.setFaturamento(0);
			emp4.setNome(null);
			emp4.impressao();
		} catch (FaturamentoInvalidoException | NomeIncompletoException e) {
			System.out.println(e.getMessage());
		}
	}
}