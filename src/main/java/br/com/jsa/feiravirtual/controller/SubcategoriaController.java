package br.com.jsa.feiravirtual.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsa.feiravirtual.model.Subcategoria;
import br.com.jsa.feiravirtual.service.SubcategoriaService;

@RestController
@RequestMapping("subcategoria")
public class SubcategoriaController {

	@Autowired
	private SubcategoriaService subcategoriaService;
	
	@PostMapping(value="/", consumes=MediaType.APPLICATION_JSON)
	public Response salvar(@RequestBody Subcategoria subcategoria) {
		subcategoriaService.salvar(subcategoria);
		return Response.ok().entity(subcategoria).build();
	}
	
	@GetMapping(value="/", produces=MediaType.APPLICATION_JSON)
	public List<Subcategoria> subcategorias(){
		return subcategoriaService.subcategorias();
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON)
	public Optional<Subcategoria> getSubcategoria(@PathParam("id") String idSubcategoria){
		return subcategoriaService.getSubcategoria(idSubcategoria);
	}
}
