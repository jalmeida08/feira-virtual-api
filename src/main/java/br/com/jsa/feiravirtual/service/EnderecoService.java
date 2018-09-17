package br.com.jsa.feiravirtual.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsa.feiravirtual.model.Endereco;
import br.com.jsa.feiravirtual.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public void salvar(Endereco endereco) {
		enderecoRepository.save(endereco);
	}
	
	public Optional<Endereco> getEndereco(String idEndereco) {
		return enderecoRepository.findById(idEndereco);
	}
	
}
