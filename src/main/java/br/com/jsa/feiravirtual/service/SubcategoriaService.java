package br.com.jsa.feiravirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsa.feiravirtual.model.Subcategoria;
import br.com.jsa.feiravirtual.repository.SubcategoriaRepository;

@Service
public class SubcategoriaService {

	@Autowired
	private SubcategoriaRepository subcategoriaRepository;
	
	
	public void salvar(Subcategoria subcategoria) {
		subcategoriaRepository.save(subcategoria);
	}
	
	public Optional<Subcategoria> getSubcategoria(String idSubcategoria) {
		return subcategoriaRepository.findById(idSubcategoria);
	}
	
	public List<Subcategoria> subcategorias(){
		return subcategoriaRepository.findAll();
	}
}
