package br.com.jsa.feiravirtual.model;

import java.io.Serializable;

public class UsuarioLogado implements Serializable {

	private static final long serialVersionUID = 849706406476904157L;

	private String email;
	private String token;

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

}
