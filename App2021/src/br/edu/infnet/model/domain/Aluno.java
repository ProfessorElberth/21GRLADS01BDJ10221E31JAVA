package br.edu.infnet.model.domain;

public class Aluno {

	private String nome;
	private String email;
	private String escolaridade;
	private String[] disciplinas;
	private String regiao;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {

		return String.format("[%s] O aluno %s (%s) da região %s está inscrito em %d disciplinas!", 
				escolaridade,
				nome,
				email,
				regiao,
				disciplinas.length
			);
	}
	
	public void impressao() {
		System.out.println(this);

		System.out.println("Disciplinas:");
		
		for(String disciplina : disciplinas) {
			System.out.println("- " + disciplina);
		}		
	}

	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}	
}