package br.edu.infnet.apppedido;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Produto;
import br.edu.infnet.apppedido.model.domain.Solicitante;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.PedidoService;

@Component
@Order(4)
public class PedidoLoader implements ApplicationRunner {

	@Autowired
	private PedidoService pedidoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Bebida suco = new Bebida();		
		suco.setId(1);
		
		Comida churrasco = new Comida();		
		churrasco.setId(2);

		Solicitante solicitante = new Solicitante();
		solicitante.setId(1);
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		listaProdutos.add(suco);
		listaProdutos.add(churrasco);
				
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Pedido pedido = new Pedido();
		pedido.setDescricao("Pedido Principal Loader");
		pedido.setProdutos(listaProdutos);
		pedido.setSolicitante(solicitante);
		pedido.setUsuario(usuario);
		pedido.setWeb(true);
		
		pedidoService.incluir(pedido);
	}

}
