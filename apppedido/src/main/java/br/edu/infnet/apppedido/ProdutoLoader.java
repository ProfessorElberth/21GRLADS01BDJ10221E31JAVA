package br.edu.infnet.apppedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.exceptions.PesoZeradoException;
import br.edu.infnet.apppedido.model.exceptions.TamanhoNegativoException;
import br.edu.infnet.apppedido.model.service.BebidaService;
import br.edu.infnet.apppedido.model.service.ComidaService;

@Component
@Order(3)
public class ProdutoLoader implements ApplicationRunner {

	@Autowired
	private BebidaService bebidaService;
	@Autowired
	private ComidaService comidaService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {
			Usuario usuario = new Usuario();
			usuario.setId(1);

			Bebida suco = new Bebida("suco", 10, 123);		
			suco.setGelada(true);
			suco.setMarca("sucao");
			suco.setTamanho(500);
			suco.setUsuario(usuario);
			bebidaService.incluir(suco);
			
			Comida churrasco = new Comida("Churrascão", 50, 234);
			churrasco.setIngredientes("Carne, frango, linguiça, molho");
			churrasco.setPeso(300);
			churrasco.setVegano(false);
			churrasco.setUsuario(usuario);
			comidaService.incluir(churrasco);

		} catch (PesoZeradoException | TamanhoNegativoException e) {
			System.out.println(e.getMessage());
		}
	}

}
