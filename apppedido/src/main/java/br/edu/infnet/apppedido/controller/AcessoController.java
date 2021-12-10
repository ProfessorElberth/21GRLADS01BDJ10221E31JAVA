package br.edu.infnet.apppedido.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.service.SolicitanteService;
import br.edu.infnet.apppedido.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private SolicitanteService solicitanteService;

	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
	@GetMapping(value = "/app")
	public String telaApp(Model model) {
		
		Map<String, Integer> mapaApp = new HashMap<String, Integer>();
		mapaApp.put("Usuários", usuarioService.obterQtde());
		mapaApp.put("Solicitantes", solicitanteService.obterQtde());
		mapaApp.put("Bebidas", 999);
		mapaApp.put("Comidas", 999);
		mapaApp.put("Sobremesas", 999);
		mapaApp.put("Pedidos", 999);
		
		model.addAttribute("mapa", mapaApp);

		return "app";
	}

	@GetMapping(value = "/logout")
	public String telaLogout(HttpSession session, SessionStatus status) {
		status.setComplete();
		
		session.removeAttribute("user");
		
		return "redirect:/";
	}

	@GetMapping(value = "/")
	public String telaIndex() {
		return "index";
	}

	@PostMapping(value = "/login")
	public String telaIndex(Model model, @RequestParam String email, @RequestParam String senha) {

		Usuario usuario = usuarioService.autenticacao(email, senha);
		
		if(usuario != null) {
			model.addAttribute("user", usuario);
			
			return "index";
		} else {
			model.addAttribute("msg", email + ", autenticação inválida.. tente novamente!!!");

			return "login";
		}
	}
}
