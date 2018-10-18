package br.com.jsa.feiravirtual.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsa.feiravirtual.JWTUtil;
import br.com.jsa.feiravirtual.model.Permissao;
import br.com.jsa.feiravirtual.model.Usuario;
import br.com.jsa.feiravirtual.model.UsuarioLogado;
import br.com.jsa.feiravirtual.repository.PermissaoRepository;
import br.com.jsa.feiravirtual.repository.UsuarioRespository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRespository usuarioRespository;

	@Autowired
	private PermissaoRepository permissaoRepository;

	public void salvar(Usuario usuario) {
		Permissao permissao = permissaoRepository.findByNomePermissaoEquals("USR01");

		List<Permissao> permissoes = new ArrayList<Permissao>();

		permissoes.add(permissao);
		usuario.setPermissao(permissoes);

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

	public UsuarioLogado login(Usuario usuario) {
		Usuario user = usuarioRespository.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		if (user == null) {
			throw new RuntimeException();
		}

		String token = JWTUtil.create(usuario.getEmail());
		String acessos = "";
		
		for (Permissao p: user.getPermissao()) {
			acessos += "#"+p.getNomePermissao();
		}
		
		UsuarioLogado me = new UsuarioLogado();
		me.setIdUsuario(user.getIdUsuario());
		me.setEmail(user.getEmail());
		me.setToken(token);
		me.setPermissoes(acessos);

		return me;

	}

	public void adicionarPermissao(String idUsuario, String idPermissao) {
		Usuario usuario = this.getUsuario(idUsuario).get();

		List<Permissao> listTPermissoes = usuario.getPermissao();

		Permissao permissao = permissaoRepository.findById(idPermissao).get();
		listTPermissoes.add(permissao);

		usuario.setPermissao(listTPermissoes);

		usuarioRespository.save(usuario);
	}

}
