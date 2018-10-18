package br.com.jsa.feiravirtual.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jsa.feiravirtual.model.Categoria;
import br.com.jsa.feiravirtual.model.Subcategoria;
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

	public void salvarSubcategoriaInCategoria(Categoria categoria) {
		Categoria c = categoriaRepository.findByIdCategoria(categoria.getIdCategoria());
		List<Subcategoria> sub = new ArrayList<Subcategoria>();
		sub = (c.getSubcategoria() == null) ? new ArrayList<Subcategoria>() : c.getSubcategoria();
		System.out.println(categoria.getSubcategoria().size());
		sub.add(categoria.getSubcategoria().get(0));
		c.setSubcategoria(sub);
		categoriaRepository.save(c);
	}

}
