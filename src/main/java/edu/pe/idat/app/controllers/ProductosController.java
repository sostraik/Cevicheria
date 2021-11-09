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

	@GetMapping("/listado")
	public String listado(Model model) {
		return "listado";
	}
	
	@ModelAttribute("productos")
	public List<Productos> listarProductos(){
		List<Productos> productos = new ArrayList<>();
		productos.add(new Productos("Pumpkin Spice Frapuccino", "S/ 14.00", "1250"));
		productos.add(new Productos("Frozen Maracuya Frapuccino", "S/ 15.00", "1350"));
		productos.add(new Productos("Choco Maacuyár Frapuccino", "S/ 16.00", "1050"));
		productos.add(new Productos("Popipó Frapuccino", "S/ 17.00", "1250"));
		productos.add(new Productos("Rial lemon Frapuccino", "S/ 18.00", "1350"));
		productos.add(new Productos("Chick chok Frapuccino", "S/ 19.00", "1050"));
		return productos;
	}

}