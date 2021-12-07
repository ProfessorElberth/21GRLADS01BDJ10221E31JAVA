package questao02;

public class PontoInteresse extends Ponto {
	
	String descricao;

	public PontoInteresse(int inicio, int fim, String descricao) {
		super(inicio, fim);
		this.descricao = descricao;
	}
}