package br.com.jsa.feiravirtual.controller;

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

import br.com.jsa.feiravirtual.model.Endereco;
import br.com.jsa.feiravirtual.service.EnderecoService;

@RestController
@RequestMapping("endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON)
	public Response salvar(@RequestBody Endereco endereco) {
		enderecoService.salvar(endereco);
		return Response.ok().entity(endereco).build();
	}
	
	@GetMapping(value="/{id}", produces=MediaType.APPLICATION_JSON)
	public Optional<Endereco> getEndereco(@PathParam("id") String idEndereco) {
		return enderecoService.getEndereco(idEndereco);
		
	}

}
