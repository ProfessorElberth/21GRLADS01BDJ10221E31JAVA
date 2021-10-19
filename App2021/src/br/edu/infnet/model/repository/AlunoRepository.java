package br.edu.infnet.model.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.model.domain.Aluno;

public class AlunoRepository {

	private static List<Aluno> lista = new ArrayList<Aluno>();
	
	public static boolean incluir(Aluno aluno) {
		
		try {
			lista.add(aluno);
			return true;
		} catch (Exception e) {
			return false;
		}		
	}
	
	public static List<Aluno> obterLista(){
		return lista;		
	}
}