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

import br.com.jsa.feiravirtual.model.Permissao;
import br.com.jsa.feiravirtual.service.PermissaoService;

@RestController
@RequestMapping("permissao")
public class PermissaoController {

	@Autowired
	private PermissaoService permissaoService;
	
	@PostMapping(value="/", consumes= MediaType.APPLICATION_JSON)
	public Response salvar(@RequestBody Permissao permissao) {
		permissaoService.savar(permissao);
		return Response.ok().entity(permissao).build();
	}
	
	@GetMapping(value="/", produces= MediaType.APPLICATION_JSON)
	public List<Permissao> permissoes() {
		return permissaoService.permissoes();
	}
	
	@GetMapping(value="/{id}", produces= MediaType.APPLICATION_JSON)
	public Optional<Permissao> getPermissao(@PathParam("id") String idPermissao) {
		return permissaoService.getPermissao(idPermissao);
	}
}
