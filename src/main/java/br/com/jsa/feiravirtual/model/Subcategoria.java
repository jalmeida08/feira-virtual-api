package br.com.jsa.feiravirtual.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Subcategoria implements Serializable {

	private static final long serialVersionUID = -6861328997986468702L;
	@Id
	private String idSubcategoria;
	private String subcategoria;
	private IndicadorAtivo indicadorSubcategoriaAtiva;
	@Version
	private String versao;

	public String getIdSubcategoria() {
		return idSubcategoria;
	}

	public void setIdSubcategoria(String idSubcategoria) {
		this.idSubcategoria = idSubcategoria;
	}

	public String getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(String subcategoria) {
		this.subcategoria = subcategoria;
	}

	public IndicadorAtivo getIndicadorSubcategoriaAtiva() {
		return indicadorSubcategoriaAtiva;
	}

	public void setIndicadorSubcategoriaAtiva(IndicadorAtivo indicadorSubcategoriaAtiva) {
		this.indicadorSubcategoriaAtiva = indicadorSubcategoriaAtiva;
	}

}