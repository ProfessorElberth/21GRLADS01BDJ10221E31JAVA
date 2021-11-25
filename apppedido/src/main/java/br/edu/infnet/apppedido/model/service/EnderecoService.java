package br.edu.infnet.apppedido.model.service;

import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.model.domain.Endereco;

@Service
public class EnderecoService {

	public Endereco obterEnderecoPorCep(String cep) {
		
		Endereco endereco = new Endereco();
		endereco.setBairro("bairro do cep " + cep);
		endereco.setCep(cep);
		endereco.setComplemento("complemento do cep " + cep);
		endereco.setLocalidade("localidade do cep " + cep);
		endereco.setLogradouro("logradouro do cep " + cep);
		endereco.setUf("RJ do cep " + cep);

		return endereco;
	}
}
