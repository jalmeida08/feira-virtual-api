package br.com.jsa.feiravirtual.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Produto implements Serializable{
	
	private static final long serialVersionUID = -3368715674382334913L;
	@Id
	private String idPoduto;
	private String titulo;
	private String marca;
	private String modelo;
	
	private String descricao;
	@DBRef
	private List<Imagem> fotos = new ArrayList<Imagem>();
	private double preco;
	@Version
	private Long versao;
	
	
}
