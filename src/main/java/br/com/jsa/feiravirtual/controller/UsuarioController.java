package br.com.jsa.feiravirtual.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jsa.feiravirtual.model.Usuario;
import br.com.jsa.feiravirtual.model.UsuarioLogado;
import br.com.jsa.feiravirtual.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = 1177139959857363666L;

	@Autowired
	private UsuarioService usuarioService;

	// return Response.ok().entity(me).build();
	// return Response.status(Response.Status.UNAUTHORIZED).build();

	@PostMapping(value = "/salvar", consumes = MediaType.APPLICATION_JSON)
	public Response salvar(@RequestBody Usuario usuario) {
		usuarioService.salvar(usuario);
		return Response.ok().entity(usuario).build();
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON)
	public Optional<Usuario> getUsuario(@PathVariable("id") String idUsuario) {
		return usuarioService.getUsuario(idUsuario);
	}

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON)
	public List<Usuario> usuarios() {
		return usuarioService.usuarios();
	}

	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON)
	public Response login(@RequestBody Usuario usuario) {

		try {

			UsuarioLogado user = usuarioService.login(usuario);
			return Response.ok().entity(user).build();
		} catch (Exception e) {
			return Response.status(Response.Status.UNAUTHORIZED).build();
		}
	}

	@DeleteMapping(value = "/{id}")
	public Response remover(@PathVariable("id") String idUsuario) {
		usuarioService.remover(idUsuario);
		return Response.ok().build();
	}

	@GetMapping(value = "/{idU}/{idA}")
	public Response adicionarPermissao(@PathVariable("user") String idUsuario,
			@PathVariable("acesso") String idPermissao) {
		usuarioService.adicionarPermissao(idUsuario, idPermissao);
		return Response.ok().build();
	}

}
