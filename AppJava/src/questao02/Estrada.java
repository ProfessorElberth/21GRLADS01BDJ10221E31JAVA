package questao02;

import java.util.ArrayList;
import java.util.List;

public class Estrada {
	
	List<Ponto> pontos;
	Estrada trecho;
	
	public Estrada() {
		pontos = new ArrayList<Ponto>();
		trecho = new Estrada();
	}

	public void adicionaPonto(Ponto ponto) {
		pontos.add(ponto);
	}

	public float comprimento() {
		return 0;
	}

	public void uniao(Estrada trecho) {
		this.trecho = trecho;
	}

	public boolean pertence(Ponto ponto) {
		return pontos.contains(ponto);
	}

	public Estrada intersecao(Estrada trecho) {
		return trecho;
	}

}
