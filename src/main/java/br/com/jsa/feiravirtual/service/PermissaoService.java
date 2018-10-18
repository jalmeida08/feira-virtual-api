package br.com.jsa.feiravirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsa.feiravirtual.model.Permissao;
import br.com.jsa.feiravirtual.repository.PermissaoRepository;

@Service
public class PermissaoService {

	@Autowired
	private PermissaoRepository permissaoRepository;
	
	public void savar(Permissao permissao) {
		permissao.setNomePermissao(permissao.getNomePermissao().toUpperCase());
		permissaoRepository.save(permissao);
	}
	
	public Optional<Permissao> getPermissao(String idPermissao){
		return permissaoRepository.findById(idPermissao);
	}

	public List<Permissao> permissoes(){
		return permissaoRepository.findAll();
	}
	
	public void remover(String idPermissao) {
		permissaoRepository.deleteById(idPermissao);
	}
}
