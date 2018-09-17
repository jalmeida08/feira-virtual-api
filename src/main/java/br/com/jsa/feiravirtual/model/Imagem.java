package br.com.jsa.feiravirtual.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Imagem implements Serializable {

	private static final long serialVersionUID = -7137403105780615963L;
	@Id
	private String idFoto;
	private String nome;
	private String extensao;
	private Byte imagem;
	@Version
	private Long versao;

	public String getIdFoto() {
		return idFoto;
	}

	public void setIdFoto(String idFoto) {
		this.idFoto = idFoto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	public Byte getImagem() {
		return imagem;
	}

	public void setImagem(Byte imagem) {
		this.imagem = imagem;
	}

	public Long getVersao() {
		return versao;
	}

	public void setVersao(Long versao) {
		this.versao = versao;
	}

}
