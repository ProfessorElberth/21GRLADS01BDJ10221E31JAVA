package br.edu.infnet.model.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.conexao.Conexao;
import br.edu.infnet.model.domain.Aluno;

public class AlunoRepository {

	public static boolean incluir(Aluno aluno) {
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement(
					"INSERT INTO TAluno (nome, email) VALUES (?,?)"
				);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getEmail());
			ps.execute();
			
			return true;
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return false;
	}
	
	public static List<Aluno> obterLista(){

		List<Aluno> lista = new ArrayList<Aluno>();
		
		try {
			PreparedStatement ps = Conexao.obterConexao().prepareStatement(
					"SELECT * FROM TAluno ORDER BY nome"
				);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				Aluno aluno = new Aluno(rs.getString("nome"), rs.getString("email"));
				aluno.setId(rs.getInt("id"));
				
				lista.add(aluno);
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return lista;
	}
}