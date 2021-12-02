package br.edu.infnet.apppedido.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.apppedido.model.exceptions.PesoZeradoException;

@Entity
@Table(name = "TComida")
public class Comida extends Produto {
	
	private float peso;
	private boolean vegano;
	private String ingredientes;
	
	public Comida() {
		// 
	}

	public Comida(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
	}

	@Override
	public float calcularValorVenda() {
		return getValor() + (vegano ? 5 : 0) + 0.01f * peso;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(peso);
		sb.append(";");
		sb.append(vegano ? "Vegano: sim" : "Vegano: não");
		sb.append(";");
		sb.append(ingredientes);
		sb.append(";");
		sb.append(calcularValorVenda());
		
		return sb.toString();
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) throws PesoZeradoException {
		
		if(peso <= 0) {
			throw new PesoZeradoException("Impossível calcular o valor de venda com o peso zerado!!!");
		}
		
		this.peso = peso;
	}

	public boolean isVegano() {
		return vegano;
	}

	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

}
