package questao01;

public class Reuniao {
	int id;
	int dia, mes, ano, hora, min, qtd_pessoas;
	
	public String linhaGravacao() {
		return id + " " + dia + " " + mes + " " +ano + " " + hora + " " + min + " " + qtd_pessoas + "\r\n";
	}
	
	@Override
	public String toString() {

		return String.format("%d - %d/%d/%d %d:%d - %d", 
					id,
					dia,mes,ano,
					hora,min,
					qtd_pessoas
				);
	}
}