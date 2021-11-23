package br.edu.infnet.apppedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.service.BebidaService;

@Controller
public class BebidaController {
	
	@Autowired
	private BebidaService bebidaService;

	@GetMapping(value = "/bebida")
	public String telaCadastro() {
		return "bebida/cadastro";
	}
	
	@GetMapping(value = "/bebidas")
	public String telaLista(Model model) {

		model.addAttribute("listaBebidas", bebidaService.obterLista());
		
		return "bebida/lista";
	}

	@PostMapping(value = "/bebida/incluir")
	public String incluir(Model model, Bebida bebida) {
		
		bebidaService.incluir(bebida);

		model.addAttribute("nome", bebida.getNome());

		return telaLista(model);
	}
	
	@GetMapping(value = "/bebida/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		bebidaService.excluir(id);

		return "redirect:/bebidas";
	}

}