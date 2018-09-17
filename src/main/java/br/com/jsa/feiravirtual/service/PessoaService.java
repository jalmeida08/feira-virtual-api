package br.com.jsa.feiravirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsa.feiravirtual.model.Pessoa;
import br.com.jsa.feiravirtual.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
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
		p.setNomeFantasia(pessoa.getNomeFantasia());
		p.setNumeroCnpj(pessoa.getNumeroCnpj());
		p.setNumeroCpf(pessoa.getNumeroCpf());
		p.setEndereco(pessoa.getEndereco());
		pessoaRepository.save(p);
	}
	
}
