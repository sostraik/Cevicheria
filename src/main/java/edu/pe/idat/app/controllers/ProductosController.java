package edu.pe.idat.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.pe.idat.app.models.Productos;

@Controller
@RequestMapping("/producto")
public class ProductosController {
	
	@GetMapping("/product")
	public String perfil(Model model) {
		Productos product = new Productos();
		product.setNombrep("Eduardo");
		product.setPreciop("Ramirez Suarez");
		product.setCantidadp("eduardo@gmail.com");
		model.addAttribute("product", product);
		return "product";
	}

	@GetMapping("/bebidas")
	public String bebidas(Model model) {
		return "listado";
	}
	
	@GetMapping("/alimentos")
	public String alimentos(Model model) {
		return "alimentos";
	}
	
	@ModelAttribute("bebidas")
	public List<Productos> listarBebidas(){
		List<Productos> productos = new ArrayList<>();
		productos.add(new Productos("Pumpkin Spice Frapuccino", "S/ 14.00", "1250"));
		return productos;
	}
	
	@ModelAttribute("bebidas2")
	public List<Productos> listarBebidas2(){
		List<Productos> productos = new ArrayList<>();
		productos.add(new Productos("Pumpkin  Frapuccino", "S/ 15.00", "1250"));
		return productos;
	}
	
	@ModelAttribute("alimentos")
	public List<Productos> listarAlimentos(){
		List<Productos> alimentos = new ArrayList<>();
		alimentos.add(new Productos("Sandwich de pavo", "S/ 13.00", "1321"));
		alimentos.add(new Productos("Sandwich Pastrani", "S/ 14.00", "1321"));
		alimentos.add(new Productos("Sandwich Chicken Pesto Parmesano", "S/ 14.00", "1321"));
		alimentos.add(new Productos("Sandwich Pavita & Queso", "S/ 10.00", "1321"));
		alimentos.add(new Productos("Sandwich Eggmont", "S/ 9.50", "1321"));
		alimentos.add(new Productos("Sandwich Pavita, queso & espinaca", "S/ 12.00", "1321"));
		return alimentos;
	}

}