package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entidades.Rmascotas;
import com.example.demo.servicios.MascotasService;


@Controller
public class MascotasControlador {
	@Autowired
private MascotasService  mascotasService;
	@GetMapping("/Mascotas1")
	public String seleccionarMascotas(Model   model) {
		try {
			List<Rmascotas> ListasMascotas=mascotasService.findAll();
			model.addAttribute("mascotas",ListasMascotas);
		} catch (Exception e) {
			System.out.println("Error al seleccionar las mascotas" +e.getCause());
		}
		return "/index";
	}
@GetMapping("/nuevamascota")
public String nuevaMascota(Model modelo) {
	modelo.addAttribute("mascotas", new Rmascotas ());
	return "/addmascotas.html";
}
@PostMapping( "/savemascotas")
public String guardarMascota(@Validated Rmascotas rmascotas) {
	mascotasService.save(rmascotas);
	return "redirect:/Mascotas1";
}

@GetMapping("/eliminarmascotas/{id}")
public String eliminar(@PathVariable long id) {
	mascotasService.deleteById(id);
	return "redirect:/Mascotas1";
}

@GetMapping("/editarmascotas/{id}")
public String editar(@PathVariable long id, Model model)
{
	Optional<Rmascotas> rmascotas= mascotasService.findById(id);
	model.addAttribute("mascotas", rmascotas.get());
	return "/editarmascotas";
}
}
	

