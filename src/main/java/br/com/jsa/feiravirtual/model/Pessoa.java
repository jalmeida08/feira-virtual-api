package br.com.jsa.feiravirtual.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Pessoa implements Serializable {

	private static final long serialVersionUID = -2754983246777898682L;

	@Id
	private String idPessoa;
	private Long numeroCpf;
	private Long numeroCnpj;
	private String nome;
	private String sobrenome;
	private String nomeFantasia;
	@DBRef
	private List<Endereco> endereco = new ArrayList<Endereco>();
	@DBRef
	private Usuario usuario;
	@Version
	private Long versao;


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

	public Long getNumeroCnpj() {
		return numeroCnpj;
	}

	public void setNumeroCnpj(Long numeroCnpj) {
		this.numeroCnpj = numeroCnpj;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}

	public Long getVersao() {
		return versao;
	}

	public void setVersao(Long versao) {
		this.versao = versao;
	}

}