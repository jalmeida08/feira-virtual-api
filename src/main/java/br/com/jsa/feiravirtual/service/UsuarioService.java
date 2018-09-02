package br.com.jsa.feiravirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsa.feiravirtual.model.Usuario;
import br.com.jsa.feiravirtual.repository.UsuarioRespository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRespository usuarioRespository;
	
	public void salvar(Usuario usuario) {
		usuarioRespository.save(usuario);
	}
	
	public Optional<Usuario> getUsuario(String idUsuario) {
		return usuarioRespository.findById(idUsuario);
	}
	
	public List<Usuario> usuarios() {
		return usuarioRespository.findAll();
	}
	
	public void remover(String idUsuario) {
		usuarioRespository.deleteById(idUsuario);
	}

}
