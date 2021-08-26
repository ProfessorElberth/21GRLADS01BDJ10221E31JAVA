package br.edu.infnet.dominio;

public class Administrativo extends Funcionario {

	private float bonus;
	private float desconto;
	
	@Override
	public float calcularSalarioLiquido() {
		return getSalario() + bonus - desconto;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

}