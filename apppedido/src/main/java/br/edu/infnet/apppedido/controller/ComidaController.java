package br.edu.infnet.apppedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apppedido.model.domain.Comida;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.ComidaService;

@Controller
public class ComidaController {
	
	@Autowired
	private ComidaService comidaService;

	@GetMapping(value = "/comida")
	public String telaCadastro() {
		return "comida/cadastro";
	}
	
	@GetMapping(value = "/comidas")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaComidas", comidaService.obterLista(usuario));
		
		return "comida/lista";
	}

	@PostMapping(value = "/comida/incluir")
	public String incluir(Model model, Comida comida, @SessionAttribute("user") Usuario usuario) {
		
		comida.setUsuario(usuario);
		
		comidaService.incluir(comida);

		model.addAttribute("nome", comida.getNome());

		return telaLista(model, usuario);
	}
	
	@GetMapping(value = "/comida/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		comidaService.excluir(id);

		return "redirect:/comidas";
	}

}