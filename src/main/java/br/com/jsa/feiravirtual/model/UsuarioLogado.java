package br.com.jsa.feiravirtual.model;

import java.io.Serializable;

public class UsuarioLogado implements Serializable {

	private static final long serialVersionUID = 849706406476904157L;
	private String idUsuario;
	private String email;
	private String token;
	private String permissoes;
	
	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(String permissoes) {
		this.permissoes = permissoes;
	}


}
