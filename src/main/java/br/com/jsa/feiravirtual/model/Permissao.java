package br.com.jsa.feiravirtual.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Permissao implements Serializable {

	private static final long serialVersionUID = 7340831151958919629L;
	@Id
	private String idPermissao;
	private String permissao;


	public String getIdPermissao() {
		return idPermissao;
	}

	public void setIdPermissao(String idPermissao) {
		this.idPermissao = idPermissao;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

}
