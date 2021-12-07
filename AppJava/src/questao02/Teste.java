package questao02;

public class Teste {

	public static void main(String[] args) {
		Estrada trecho1 = new Estrada();
		trecho1.adicionaPonto(new Ponto(10,20));
		trecho1.adicionaPonto(new Ponto(20,20));
		trecho1.adicionaPonto(new PontoInteresse(20,40,"Posto 24h"));
		trecho1.adicionaPonto(new Ponto(20,50));
		
		System.out.println(String.format("Comprimento: %.2f\n", trecho1.comprimento()));
		
		Estrada trecho2 = new Estrada();
		trecho2.adicionaPonto(new Ponto(20,50));
		trecho2.uniao(trecho1);
		trecho2.adicionaPonto(new PontoInteresse(20,60,"PRF"));
		
		System.out.println(trecho2);
		System.out.println(String.format("Comprimento: %.2f\n", trecho2.comprimento()));
		System.out.println("Pertence: " + trecho2.pertence(new Ponto(20,60)) + "\n");
		System.out.println(trecho2.intersecao(trecho1));
		System.out.println(String.format("Comprimento: %.2f\n", trecho2.intersecao(trecho1).comprimento()));
	}
}