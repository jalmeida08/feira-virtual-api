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

import br.com.jsa.feiravirtual.model.Categoria;
import br.com.jsa.feiravirtual.service.CategoriaService;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON)
	public Response salvar(@RequestBody Categoria categoria) {
		categoriaService.salvar(categoria);
		return Response.ok().entity(categoria).build();
	}

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON)
	public List<Categoria> categorias() {
		return categoriaService.categorias();
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON)
	public Optional<Categoria> getCategoria(@PathParam("id") String idCategoria) {
		return categoriaService.getCategoria(idCategoria);
	}
}
