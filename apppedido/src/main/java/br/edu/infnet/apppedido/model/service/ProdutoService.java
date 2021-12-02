package br.edu.infnet.apppedido.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.model.domain.Produto;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public void excluir(Integer id) {
		produtoRepository.deleteById(id);
	}
	
	public Produto obterPorId(Integer id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	public List<Produto> obterLista(Usuario usuario){
		return (List<Produto>) produtoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}
}
