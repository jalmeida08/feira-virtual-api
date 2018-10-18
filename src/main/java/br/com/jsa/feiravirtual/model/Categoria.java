package br.com.jsa.feiravirtual.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Categoria implements Serializable {

	private static final long serialVersionUID = 2916030791614385653L;

	@Id
	private String idCategoria;
	private String categoria;
	private boolean indicadorGenero;
	@DBRef
	private List<Subcategoria> subcategoria;
	@Version
	private Long versao;

	public String getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Subcategoria> getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(List<Subcategoria> subcategoria) {
		this.subcategoria = subcategoria;
	}

	public boolean isIndicadorGenero() {
		return indicadorGenero;
	}

	public void setIndicadorGenero(boolean indicadorGenero) {
		this.indicadorGenero = indicadorGenero;
	}


}
