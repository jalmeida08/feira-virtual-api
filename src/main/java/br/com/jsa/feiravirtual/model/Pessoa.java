package br.com.jsa.feiravirtual.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pessoa implements Serializable {

	private static final long serialVersionUID = -2754983246777898682L;

	@Id
	private String idPessoa;
	private Long numeroCpf;
	private String nome;
	@DBRef
	private Usuario usuario;

	public String getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(String idPessoa) {
		this.idPessoa = idPessoa;
	}

	public Long getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(Long numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}