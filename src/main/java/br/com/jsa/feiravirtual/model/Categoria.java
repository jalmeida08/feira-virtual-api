package br.com.jsa.feiravirtual.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Categoria implements Serializable {

	private static final long serialVersionUID = 2916030791614385653L;

	@Id
	private String idCategoria;
	private String categoria;
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


}
