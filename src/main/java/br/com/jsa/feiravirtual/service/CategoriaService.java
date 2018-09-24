package br.com.jsa.feiravirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsa.feiravirtual.model.Categoria;
import br.com.jsa.feiravirtual.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public void salvar(Categoria categoria) {
		categoriaRepository.save(categoria);
	}
	
	public List<Categoria> categorias() {
		return categoriaRepository.findAll();
	}
	
	public Optional<Categoria> getCategoria(String idCategoria) {
		return categoriaRepository.findById(idCategoria);
	}
	
}
