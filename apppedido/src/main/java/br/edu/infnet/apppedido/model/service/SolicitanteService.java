package br.edu.infnet.apppedido.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.model.domain.Solicitante;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.repository.SolicitanteRepository;

@Service
public class SolicitanteService {
	
	@Autowired
	private SolicitanteRepository solicitanteRepository;

	public List<Solicitante> obterLista(){
				
		return (List<Solicitante>)solicitanteRepository.findAll();
	}
	
	public List<Solicitante> obterLista(Usuario usuario){
		
		return (List<Solicitante>)solicitanteRepository.obterLista(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void incluir(Solicitante solicitante){

		solicitanteRepository.save(solicitante);
	}
	
	public void excluir(Integer id) {
		solicitanteRepository.deleteById(id);
	}

	public Integer obterQtde() {
		return (int) solicitanteRepository.count();
	}
}
