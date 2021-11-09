package edu.pe.idat.app.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.pe.idat.app.models.domain.Pais;
import edu.pe.idat.app.models.domain.Usuario;

@Controller
@SessionAttributes("usuario")
@RequestMapping("/usuario")
public class FormController {

	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("titulo", "Ingrese sus datos");
		usuario.setId(1);
		model.addAttribute("usuario", usuario);
		return "form";
	}

	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Inicio de sesión");
			return "form";
		}
		model.addAttribute("titulo", "¡Bienvenid@!");
		model.addAttribute("usuario", usuario);
		status.setComplete();
		return "resultado";
	}

	@ModelAttribute("listPaises")
	public List<String> listPaises() {
		return Arrays.asList("Perú", "Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador");
	}

	@ModelAttribute("mapPaises")
	public Map<String, String> mapPaises() {
		Map<String, String> paises = new HashMap<>();
		paises.put("PE", "Perú");
		paises.put("AR", "Argentina");
		paises.put("BO", "Bolivia");
		paises.put("BR", "Brasil");
		paises.put("CL", "Chile");
		paises.put("CO", "Colombia");
		paises.put("EC", "Ecuador");
		return paises;
	}

	@ModelAttribute("objectPaises")
	public List<Pais> objectPaises() {
		return Arrays.asList(
				new Pais("PE", "Perú"),
				new Pais("AR", "Argentina"),
				new Pais("BO", "Bolivia"),
				new Pais("BR", "Brasil"),
				new Pais("CL", "Chile"),
				new Pais("CO", "Colombia"),
				new Pais("EC", "Ecuador"));
	}

}
