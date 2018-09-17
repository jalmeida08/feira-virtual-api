package br.com.jsa.feiravirtual.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsa.feiravirtual.model.Pessoa;
import br.com.jsa.feiravirtual.service.PessoaService;

@RestController
@RequestMapping("pessoa")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
	
	@PostMapping
	@RequestMapping(value ="/salvar", consumes=MediaType.APPLICATION_JSON)
	public Response salvar(@RequestBody Pessoa pessoa) {
		pessoaService.savar(pessoa);
		return Response.ok().entity(pessoa).build();
	}
	
	@GetMapping(value="/{id}", produces= MediaType.APPLICATION_JSON)
	public Optional<Pessoa> getPessoaa(@PathVariable("id") String idPessoa) {
		return pessoaService.getPessoa(idPessoa);
	}
	
	@PostMapping (value ="/atualizarPessoaVendedor", consumes=MediaType.APPLICATION_JSON)
	public Response atualizarPessoaVendedor(@RequestBody Pessoa pessoa) {
		pessoaService.atualziarPessoaVendedir(pessoa);
		return Response.ok().entity(pessoa).build();
	}
	
	@GetMapping(value="/usuario/{id}", produces= MediaType.APPLICATION_JSON)
	public Pessoa getPessoaPorUsuario(@PathVariable("id") String idPessoa) {
		return pessoaService.buscarPessoaPorIdUsuario(idPessoa);
	}
	
	@GetMapping(value="/", produces=MediaType.APPLICATION_JSON, consumes=MediaType.APPLICATION_JSON)
	public List<Pessoa>pessoas(){
		return pessoaService.pessoas();
	}
	
	@PutMapping(value="/",consumes=MediaType.APPLICATION_JSON)
	public Response atualizarPessoa(@RequestBody Pessoa pessoa) {
		pessoaService.savar(pessoa);
		return Response.ok().entity(pessoa).build();
	}
	
	@DeleteMapping(value="/{id}")
	public Response remover(@PathVariable("id") String idPessoa) {
		pessoaService.remover(idPessoa);
		return Response.ok().build(); 
	}
}
