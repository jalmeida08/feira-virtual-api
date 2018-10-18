package br.com.jsa.feiravirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsa.feiravirtual.model.Permissao;
import br.com.jsa.feiravirtual.model.Pessoa;
import br.com.jsa.feiravirtual.model.Usuario;
import br.com.jsa.feiravirtual.repository.PermissaoRepository;
import br.com.jsa.feiravirtual.repository.PessoaRepository;
import br.com.jsa.feiravirtual.repository.UsuarioRespository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private UsuarioRespository usuarioRespository;
	
	@Autowired
	private PermissaoRepository permissaoRepository;
	
	public void savar(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
	public Optional<Pessoa> getPessoa(String idPessoa){
		return pessoaRepository.findById(idPessoa);
	}

	public List<Pessoa> pessoas(){
		return pessoaRepository.findAll();
	}
	
	public void remover(String idPessoa) {
		pessoaRepository.deleteById(idPessoa);
	}
	
	public Pessoa buscarPessoaPorIdUsuario(String idUsuario) {
		return pessoaRepository.findByUsuario(idUsuario);
	}

	public void atualziarPessoaVendedir(Pessoa pessoa) {
		Pessoa p = pessoaRepository.findByUsuario(pessoa.getUsuario().getIdUsuario());
		Usuario usuario = usuarioRespository.findByIdUsuario(pessoa.getUsuario().getIdUsuario());
		Permissao permissao = permissaoRepository.findByNomePermissaoEquals("VEN01");
		
		List<Permissao> listTPermissoes = usuario.getPermissao();
		listTPermissoes.add(permissao);
		usuario.setPermissao(listTPermissoes);
		
		
		p.setNomeFantasia(pessoa.getNomeFantasia());
		p.setNumeroCnpj(pessoa.getNumeroCnpj());
		p.setNumeroCpf(pessoa.getNumeroCpf());
		p.setEndereco(pessoa.getEndereco());
		
		usuarioRespository.save(usuario);
		pessoaRepository.save(p);
	}
	
}
