package br.edu.infnet.apppedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.repository.UsuarioRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario usuario = new Usuario();
		usuario.setEmail("elberth.moraes@prof.infnet.edu.br");
		usuario.setNome("Elberth Moraes");
		usuario.setSenha("123");
		usuario.setAdmin(true);
		
		usuarioRepository.save(usuario);
	}
}