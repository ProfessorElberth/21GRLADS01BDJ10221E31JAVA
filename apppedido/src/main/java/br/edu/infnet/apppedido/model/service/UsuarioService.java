package br.edu.infnet.apppedido.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario autenticacao(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public List<Usuario> obterLista(){
		return (List<Usuario>) usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "email"));
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);		
	}

	public Integer obterQtde() {
		return (int) usuarioRepository.count();
	}
}