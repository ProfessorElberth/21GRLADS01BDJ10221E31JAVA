package br.edu.infnet.apppedido.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String escolaridade;
	private String[] disciplinas;
	private String regiao;
	private int idade;
	private float mensalidade;
	
	public Aluno() {
		//
	}
	
	public Aluno(String nome, String email) {
		this();
		this.nome = nome;
		this.email = email;
	}
	
	public Aluno(Integer id, String nome, String email) {
		this(nome, email);
		this.id = id;
	}

	@Override
	public String toString() {

		return String.format("[%s] O aluno %s (%s) "
				+ "da regi�o %s "
				+ "tem %d anos "
				+ "e paga %.2f de mensalidade "
				+ "est� inscrito em %d disciplinas!", 
				escolaridade,
				nome,
				email,
				regiao,
				idade,
				mensalidade,
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
}